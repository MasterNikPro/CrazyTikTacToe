package com.nikzakharenko.crazytictactoe.auth.domain

interface RecoveryUseCase {
    fun recovery(auth: AuthModel)
}
