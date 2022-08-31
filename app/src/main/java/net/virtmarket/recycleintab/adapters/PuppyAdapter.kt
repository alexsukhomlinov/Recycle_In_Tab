package net.virtmarket.recycleintab.adapters

//import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.widget.LinearLayout
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.virtmarket.recycleintab.R
import net.virtmarket.recycleintab.models.User
import net.virtmarket.recycleintab.models.PuppyHolder

class PuppyAdapter (private val user: ArrayList<User>) : RecyclerView.Adapter<PuppyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuppyHolder {
        val puppyItem = LayoutInflater.from(parent.context).inflate(R.layout.puppy_item, parent, false) as LinearLayout
        return PuppyHolder(puppyItem)
    }

    override fun onBindViewHolder(holder: PuppyHolder, position: Int) {
        holder.updateWithPuppy(user[position])
        holder.userButton.setOnClickListener {
            println("ClicKing: "+position)
        }

    }

    override fun getItemCount(): Int {
        return user.toArray().count();
    }

}