package com.nikzakharenko.crazytictactoe.di

import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val firebaseModule = module {
    factory<FirebaseAuth>{
        FirebaseAuth.getInstance()
    }
}