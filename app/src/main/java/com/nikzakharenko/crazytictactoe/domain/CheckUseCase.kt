package com.nikzakharenko.crazytictactoe.domain

interface CheckUseCase {
    fun checkData(auth:AuthModel): Boolean
}