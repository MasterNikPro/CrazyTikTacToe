package com.nikzakharenko.crazytictactoe.auth.data

import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.RecoveryUseCase

class RecoveryUseCaseImpl:RecoveryUseCase {
    override  fun recovery(auth: AuthModel) {
       auth.firebaseAuth.sendPasswordResetEmail(auth.email)
    }
}