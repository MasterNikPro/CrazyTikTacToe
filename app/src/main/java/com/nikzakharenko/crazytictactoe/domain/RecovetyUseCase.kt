package com.nikzakharenko.crazytictactoe.domain

interface RecovetyUseCase {
    fun recovery(auth:AuthModel): Boolean
}