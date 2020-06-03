package com.mahdi20.dagger2.myClass

import android.util.Base64
import android.util.Log
import com.mahdi20.dagger2.di.qualifier.CustomSecure
import javax.inject.Inject

class Hasher @Inject constructor() {


    @Inject
    lateinit var secure: Secure

    var hasher: Hasher? = null


    fun encrypt(str: String): String {
        Log.e("######" , "encrypt: ${secure.KEY}")
        return Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
    }

    fun dycrypt(str: String): String {
//        Log.e("######" , "dycrypt: ${secure.KEY}")
        return String(Base64.decode(str, Base64.DEFAULT))
    }


    @Inject
    fun secureInject(@CustomSecure secure: Secure) {
        this.secure = secure
    }


//    @Inject
//    fun asoodeh(): String {
//        return "asoodeh: ${key.KEY}"
//    }


}