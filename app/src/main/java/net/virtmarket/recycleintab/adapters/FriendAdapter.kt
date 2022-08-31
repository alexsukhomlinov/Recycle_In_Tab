package net.virtmarket.recycleintab.adapters

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import net.virtmarket.recycleintab.R
import net.virtmarket.recycleintab.models.Friend
import net.virtmarket.recycleintab.models.FriendFactory
import net.virtmarket.recycleintab.models.FriendHolder
import net.virtmarket.recycleintab.MainActivity
import net.virtmarket.recycleintab.models.PuppyFactory


class FriendAdapter(
    //private  val onItemClick: (position: Int) -> Unit,
    private val friend: ArrayList<Friend>): RecyclerView.Adapter<FriendHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendHolder {
        val friendItem = LayoutInflater.from(parent.context).inflate(R.layout.friend_item, parent, false) as LinearLayout
        return FriendHolder(friendItem)
    }



    override fun onBindViewHolder(holder: FriendHolder, position: Int) {
        holder.updateWithFriend(friend[position])
        holder.deleteFromFriendsButton.setOnClickListener {
            println("ClicKingDelete: "+position)

            friend.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, getItemCount())


        }
        holder.saveFriendDescription.setOnClickListener {
            println("ClicKing Save Friend Description: "+position)
            insertItem(position)
        }


    }

    fun insertItem(position:Int) {
                val index = 1
        val newItem=Friend("A777",
            "Alex",
        "a@b.com",

            friend[position].imageFile,

            "New Item"


        )
        friend.add(index,newItem)
        notifyDataSetChanged()
    }



    override fun getItemCount(): Int {
        return friend.toArray().count();
    }

}