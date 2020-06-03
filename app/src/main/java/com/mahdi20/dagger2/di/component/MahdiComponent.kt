package com.mahdi20.dagger2.di.component

import android.content.Context
import com.mahdi20.dagger2.myClass.Hasher
import com.mahdi20.dagger2.bank.MellatApi
import com.mahdi20.dagger2.di.module.ApplicationModule
import com.mahdi20.dagger2.myClass.SafePref
import dagger.BindsInstance
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface MahdiComponent {

    fun getHash(): Hasher

    fun getMellatApi(): MellatApi

    fun getSafePref(): SafePref


    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setContext(context: Context): Builder
        fun build(): MahdiComponent
    }

}




