package com.nikzakharenko.crazytictactoe.auth.domain

interface LoginUseCase {
    fun login(auth: AuthModel)
}
