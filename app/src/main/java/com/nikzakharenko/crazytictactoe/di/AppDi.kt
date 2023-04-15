package com.nikzakharenko.crazytictactoe.di

import com.nikzakharenko.crazytictactoe.presentation.fragments.registrationfragment.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        RegistrationViewModel(get())
    }
}