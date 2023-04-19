package com.nikzakharenko.crazytictactoe.auth.domain

interface CheckUseCase {
    fun checkData(auth: AuthModel): Boolean
}