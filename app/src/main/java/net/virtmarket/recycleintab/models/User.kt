package net.virtmarket.recycleintab.models

import android.graphics.drawable.Drawable

/**
 * Created by Oleksandr .
 * Data model for a Puppy
 */

class User (var id: String, var username: String, var email: String, var imageFile: Drawable?, var isFullGrown: Boolean, var isLeashTrained: Boolean, var isActive: Boolean)