package com.nikzakharenko.crazytictactoe.auth.di

import com.nikzakharenko.crazytictactoe.auth.fragments.loginfragment.LoginViewModel
import com.nikzakharenko.crazytictactoe.auth.fragments.recoveryfragment.RecoveryViewModel
import com.nikzakharenko.crazytictactoe.auth.fragments.registrationfragment.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        LoginViewModel(loginUseCase = get(), checkDataUseCase = get())
    }
    viewModel { RegistrationViewModel(registrationUseCase = get(), checkData = get()) }
    viewModel { RecoveryViewModel(recoveryUseCase = get(), checkData = get()) }

}