package com.sanketguru.mydaggersample.di

/**
 * Created by Raju on 27-02-2018.
 */

import com.sanketguru.mydaggersample.Add
import com.sanketguru.mydaggersample.Calculate
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

/**
 * Created by Sanket Gurav on 26-02-2018.
 */
// Koin module
val myModule : Module = applicationContext {
    // provide { MyPresenter(get()) } // get() will resolve Repository instance
    provide { Add("baba") as Calculate }
}