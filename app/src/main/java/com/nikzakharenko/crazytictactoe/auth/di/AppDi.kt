package com.nikzakharenko.crazytictactoe.auth.di

import com.nikzakharenko.crazytictactoe.auth.fragments.loginfragment.LoginViewModel
import com.nikzakharenko.crazytictactoe.auth.fragments.registrationfragment.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        RegistrationViewModel(get())
        LoginViewModel(get())
    }
}