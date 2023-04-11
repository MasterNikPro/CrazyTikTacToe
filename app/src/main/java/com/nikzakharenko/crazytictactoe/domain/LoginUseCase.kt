package com.nikzakharenko.crazytictactoe.domain

interface LoginUseCase {
    fun login(auth:AuthModel): Boolean
}