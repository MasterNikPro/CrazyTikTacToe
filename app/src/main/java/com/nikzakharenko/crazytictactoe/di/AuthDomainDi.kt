package com.nikzakharenko.crazytictactoe.di

import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.data.CheckDataUseCaseImpl
import com.nikzakharenko.crazytictactoe.data.LoginUseCaseImpl
import com.nikzakharenko.crazytictactoe.data.RecoveryUseCaseImpl
import com.nikzakharenko.crazytictactoe.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase
import com.nikzakharenko.crazytictactoe.domain.RecoveryUseCase
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase
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