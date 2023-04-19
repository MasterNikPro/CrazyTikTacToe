package com.nikzakharenko.crazytictactoe.auth.domain

interface RecovetyUseCase {
   suspend fun recovery(auth: AuthModel)
}