package com.mahdi20.dagger2.di.module

import com.mahdi20.dagger2.bank.MellatApi
import com.mahdi20.dagger2.di.qualifier.CustomSecure
import com.mahdi20.dagger2.myClass.Secure
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun getMellatApiOld(): MellatApi {
        var mellatApi = MellatApi()
        mellatApi.BANK_KEY = "66666"
        return mellatApi
    }


    @Provides
    fun getsecure1(): Secure {
        val secure = Secure()
        secure.KEY = "1111"

        return secure
    }

    @CustomSecure
    @Provides
    fun getsecure2(): Secure {
        val secure = Secure()
        secure.KEY = "2222"
        return secure
    }


}