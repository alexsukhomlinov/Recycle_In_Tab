package net.virtmarket.recycleintab.models

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import net.virtmarket.recycleintab.R

class FriendHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val friendImage: ImageView = itemView.findViewById(R.id.friendImageView)
    private val friendName: TextView = itemView.findViewById(R.id.friendTextView)
    private val friendDescription: EditText = itemView.findViewById(R.id.friendDescription)

    val deleteFromFriendsButton: Button = itemView.findViewById(R.id.buttonDeleteFromFriends)
    val saveFriendDescription: Button = itemView.findViewById(R.id.buttonSaveFriendDescription)


    fun updateWithFriend(friend: Friend) {
        friendImage.setImageDrawable(friend.imageFile)
        friendName.text = friend.username
        //friendDescription.text=friend.friendDescription
    }


}