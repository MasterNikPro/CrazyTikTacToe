package com.nikzakharenko.crazytictactoe.di

import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase
import org.koin.dsl.module

val registerModule = module {
    factory<RegistrationUseCase> {
        RegistrationUseCaseImpl()
    }
    factory { RegistrationUseCaseImpl() }
    single { FirebaseAuth.getInstance() }


}