package net.virtmarket.recycleintab.models

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import net.virtmarket.recycleintab.R

class PuppyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val puppyImage: ImageView = itemView.findViewById(R.id.puppyImageView)
    private val puppyName: TextView = itemView.findViewById(R.id.puppyTextView)

    val userButton: Button = itemView.findViewById(R.id.buttonAdToFriends)

    fun updateWithPuppy(puppy: User) {
        puppyImage.setImageDrawable(puppy.imageFile)
        puppyName.text = puppy.username
    }
}