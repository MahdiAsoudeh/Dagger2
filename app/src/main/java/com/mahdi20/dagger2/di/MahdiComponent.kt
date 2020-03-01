package com.mahdi20.dagger2.di

import com.mahdi20.dagger2.Hasher
import dagger.Component

@Component
interface MahdiComponent {

    fun getHash(): Hasher

}