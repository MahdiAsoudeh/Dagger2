package com.mahdi20.dagger2.di.component

import com.mahdi20.dagger2.Hasher
import com.mahdi20.dagger2.bank.MellatApi
import com.mahdi20.dagger2.di.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface MahdiComponent {

    fun getHash(): Hasher

    fun getMellatApi(): MellatApi
}