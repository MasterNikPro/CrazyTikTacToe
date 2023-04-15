package com.nikzakharenko.crazytictactoe.app

import android.app.Application
import com.nikzakharenko.crazytictactoe.di.appModule
import com.nikzakharenko.crazytictactoe.di.firebaseModule
import com.nikzakharenko.crazytictactoe.di.loginModule
import com.nikzakharenko.crazytictactoe.di.registerModule
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
            modules(listOf(firebaseModule, loginModule, registerModule, appModule))

        }
    }
}