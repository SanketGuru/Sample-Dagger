package com.sanketguru.mydaggersample

/**
 * Created by Raju on 27-02-2018.
 */
import android.app.Application
import com.sanketguru.mydaggersample.di.myModule

import org.koin.android.ext.android.startKoin

/**
 * Created by Sanket Gurav on 26-02-2018.
 */

class App : Application(){
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin(this, listOf(myModule))

    }
}