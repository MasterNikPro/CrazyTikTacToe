package com.nikzakharenko.crazytictactoe.auth.data

import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.RegistrationUseCase

class RegistrationUseCaseImpl : RegistrationUseCase {
    override fun registration(auth: AuthModel) {
        auth.firebaseAuth.createUserWithEmailAndPassword(auth.email, auth.password)
    }
}