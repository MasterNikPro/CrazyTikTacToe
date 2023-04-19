package com.nikzakharenko.crazytictactoe.app

import android.app.Application
import com.nikzakharenko.crazytictactoe.auth.di.appModule
import com.nikzakharenko.crazytictactoe.auth.di.loginModule
import com.nikzakharenko.crazytictactoe.auth.di.registerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.INFO)
            androidContext(this@App)
            modules(listOf(appModule, registerModule, loginModule))

        }
    }
}