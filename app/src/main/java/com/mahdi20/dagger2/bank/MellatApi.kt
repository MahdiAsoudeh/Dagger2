package com.mahdi20.dagger2.bank

// for example this is limit class for us
class MellatApi {

    var BANK_KEY = "99999"

    fun pay(): String {
        return "mellat pay: $BANK_KEY";
    }

}