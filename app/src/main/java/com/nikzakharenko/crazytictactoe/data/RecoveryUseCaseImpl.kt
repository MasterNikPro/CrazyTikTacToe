package com.nikzakharenko.crazytictactoe.data

import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.RecoveryUseCase

class RecoveryUseCaseImpl: RecoveryUseCase {
    override  fun recovery(auth: AuthModel) {
       auth.firebaseAuth.sendPasswordResetEmail(auth.email)
    }
}