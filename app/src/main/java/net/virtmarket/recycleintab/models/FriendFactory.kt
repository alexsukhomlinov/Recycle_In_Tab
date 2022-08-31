package net.virtmarket.recycleintab.models

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat

class FriendFactory (private val context: Context) {

    val friends: ArrayList<Friend>
        get() {
            val result = ArrayList<Friend>()
            //result.add(User("id01","Harper", getDescription(0), getDrawableByName("puppy1"), false, false, false))
            result.add(Friend("id01","Harper", "test1@gmail.com", getDrawableByName("puppy1"), "My Friend 1"))
            result.add(Friend("id02","Lucy", "test1@gmail.com", getDrawableByName("puppy2"), "My Friend 2"))
            result.add(Friend("id03","Adrian", "test1@gmail.com", getDrawableByName("puppy3"), "My Friend 3"))

            return result
        }

    private fun getDrawableByName(name: String): Drawable? {
        val resources = context.getResources()
        val resourceId = resources.getIdentifier(name, "drawable",
            context.getPackageName())
        return ContextCompat.getDrawable(context, resourceId)
    }

     fun onItemClick(position: Int) {
        print("Click Add parametric"+ position)
    }
}