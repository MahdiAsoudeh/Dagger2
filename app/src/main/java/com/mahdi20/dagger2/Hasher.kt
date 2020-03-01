package com.mahdi20.dagger2

import javax.inject.Inject

class Hasher @Inject constructor() {


    @Inject
    lateinit var key: Secure


    fun encrypt(str: String): String {
        return str + "zxc ${key.KEY}"
    }

    fun dycript(str: String): String {
        return str.replace("zxc", "")
    }


    @Inject
    fun asoodeh(): String {
        return "asoodeh: ${key.KEY}"
    }


}