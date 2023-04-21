package com.nikzakharenko.crazytictactoe.auth.domain

interface CheckDataUseCase {
    fun checkData(auth: AuthModel): Boolean
}