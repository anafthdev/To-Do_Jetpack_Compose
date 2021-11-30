package com.anafthdev.todo.utils

import android.content.Context
import android.widget.Toast

object AppUtil {
	
	fun Any.toast(context: Context, length: Int = Toast.LENGTH_SHORT) = Toast.makeText(context, this.toString(), length).show()
}