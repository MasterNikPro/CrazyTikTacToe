package com.nikzakharenko.crazytictactoe.domain

interface CheckDataUseCase {
    fun checkData(auth: AuthModel): Boolean
}