package com.nikzakharenko.crazytictactoe.auth.di

import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.auth.data.LoginUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.domain.LoginUseCase
import com.nikzakharenko.crazytictactoe.auth.domain.RegistrationUseCase
import org.koin.dsl.module

val registerModule = module {
    factory<RegistrationUseCase> {
        RegistrationUseCaseImpl()
    }
    single { FirebaseAuth.getInstance() }
}
val loginModule= module {

    factory<LoginUseCase> {
        LoginUseCaseImpl()
    }
}