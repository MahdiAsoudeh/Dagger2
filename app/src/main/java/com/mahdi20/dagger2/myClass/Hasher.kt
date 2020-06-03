package com.mahdi20.dagger2.myClass

import android.util.Base64
import javax.inject.Inject

class Hasher @Inject constructor() {


    @Inject
    lateinit var secure: Secure

    var hasher: Hasher? = null


    fun encrypt(str: String): String {
        return Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
    }

    fun dycrypt(str: String): String {
        return String(Base64.decode(str, Base64.DEFAULT))
    }


    @Inject
    fun secureInject(secure: Secure) {
        this.secure = secure
    }


//    @Inject
//    fun asoodeh(): String {
//        return "asoodeh: ${key.KEY}"
//    }


}