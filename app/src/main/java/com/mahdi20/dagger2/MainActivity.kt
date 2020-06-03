package com.mahdi20.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mahdi20.dagger2.bank.MellatApi
import com.mahdi20.dagger2.di.component.DaggerMahdiComponent
import com.mahdi20.dagger2.di.component.MahdiComponent
import com.mahdi20.dagger2.myClass.Hasher

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // sample custom builder for inject context
        val component = DaggerMahdiComponent.builder().setContext(baseContext).build()
        val safePref = component.getSafePref()
        var a1 = safePref.put("a", "1234")
        var a2 = safePref.get("a", "")
        Log.e("#######", "a1: $a1")
        Log.e("#######", "b2: $a2")


        // befor the custom builder
//        var hash: Hasher = DaggerMahdiComponent.create().getHash()
//        var enc = hash.encrypt("3")
//        var dyc = hash.dycrypt("5")
//        var aso = hash.asoodeh()
//        Log.i("ZZZZZZZ", "$enc")
//        Log.i("ZZZZZZZ", "$dyc")
//        Log.i("ZZZZZZZ", "$aso")

//        var mellat: MellatApi = DaggerMahdiComponent.create().getMellatApi()
//        mellat.pay()


    }
}
