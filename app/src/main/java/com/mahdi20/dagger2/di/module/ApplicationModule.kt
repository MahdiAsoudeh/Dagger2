package com.mahdi20.dagger2.di.module

import com.mahdi20.dagger2.bank.MellatApi
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun getMellatApi(): MellatApi {
        var mellatApi = MellatApi()
        mellatApi.BANK_KEY = "66666"
        return mellatApi
    }

}