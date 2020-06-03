package com.mahdi20.dagger2.myClass

import android.content.Context
import android.util.Log
import javax.inject.Inject

class SafePref @Inject constructor(val context: Context, val hasher: Hasher) {

    private val pref = context.getSharedPreferences("dg", Context.MODE_PRIVATE)
    private val editor = pref.edit()

    fun put(key: String, value: String) {
        val enc = hasher.encrypt(value)
        Log.e("#######", "enc is $enc")
        editor.putString(key, enc)
        editor.commit()
    }

    fun get(key: String, default: String): String {
        return hasher.dycrypt(pref.getString(key, default) ?: default)
    }

}