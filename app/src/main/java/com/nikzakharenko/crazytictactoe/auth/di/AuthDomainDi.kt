package com.nikzakharenko.crazytictactoe.auth.di

import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.auth.data.CheckDataUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.data.LoginUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.data.RecoveryUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.auth.domain.LoginUseCase
import com.nikzakharenko.crazytictactoe.auth.domain.RecoveryUseCase
import com.nikzakharenko.crazytictactoe.auth.domain.RegistrationUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val registerModule = module {
    factory<RegistrationUseCase> {
        RegistrationUseCaseImpl()
    }
    single { FirebaseAuth.getInstance() }
}
val loginModule = module {
    factory<LoginUseCase> {
        LoginUseCaseImpl()
    }
}
val recoveryModule = module {
    factory<RecoveryUseCase> {
        RecoveryUseCaseImpl()
    }
}
val checkDataModule= module {
    factory<CheckDataUseCase> {
        CheckDataUseCaseImpl(context = androidContext())
    }
}