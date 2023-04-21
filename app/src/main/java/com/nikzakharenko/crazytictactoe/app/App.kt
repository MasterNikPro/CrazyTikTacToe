package com.nikzakharenko.crazytictactoe.app

import android.app.Application
import com.nikzakharenko.crazytictactoe.auth.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App:Application() {

    override fun onCreate() {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(checkDataModule, registerModule, loginModule, recoveryModule,appModule))

        }
        super.onCreate()

    }
}