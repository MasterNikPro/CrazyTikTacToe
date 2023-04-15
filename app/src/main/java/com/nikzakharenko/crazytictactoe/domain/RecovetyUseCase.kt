package com.nikzakharenko.crazytictactoe.domain

interface RecovetyUseCase {
   suspend fun recovery(auth:AuthModel): Boolean
}