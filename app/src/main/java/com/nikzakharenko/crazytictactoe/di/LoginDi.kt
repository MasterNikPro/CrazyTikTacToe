package com.nikzakharenko.crazytictactoe.di

import com.nikzakharenko.crazytictactoe.data.LoginUseCaseImpl
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase
import org.koin.dsl.module

val loginModule= module {

    factory<LoginUseCase> {
        LoginUseCaseImpl()
    }
}