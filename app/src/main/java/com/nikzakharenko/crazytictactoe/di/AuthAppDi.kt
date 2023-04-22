package com.nikzakharenko.crazytictactoe.di

import com.nikzakharenko.crazytictactoe.fragments.loginfragment.LoginViewModel
import com.nikzakharenko.crazytictactoe.fragments.recoveryfragment.RecoveryViewModel
import com.nikzakharenko.crazytictactoe.fragments.registrationfragment.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        LoginViewModel(loginUseCase = get(), checkDataUseCase = get())
    }
    viewModel { RegistrationViewModel(registrationUseCase = get(), checkData = get()) }
    viewModel { RecoveryViewModel(recoveryUseCase = get(), checkData = get()) }

}