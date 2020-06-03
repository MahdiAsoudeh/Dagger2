package com.mahdi20.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mahdi20.dagger2.bank.MellatApi
import com.mahdi20.dagger2.di.component.DaggerMahdiComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hash: Hasher = DaggerMahdiComponent.create().getHash()
        var enc = hash.encrypt("3")
        var dyc = hash.dycript("5")

        var aso = hash.asoodeh()

        Log.i("ZZZZZZZ", "$enc")
        Log.i("ZZZZZZZ", "$dyc")
        Log.i("ZZZZZZZ", "$aso")

        /////////////////////////////////////////////////


        var mellat: MellatApi = DaggerMahdiComponent.create().getMellatApi()
        mellat.pay()


    }
}
