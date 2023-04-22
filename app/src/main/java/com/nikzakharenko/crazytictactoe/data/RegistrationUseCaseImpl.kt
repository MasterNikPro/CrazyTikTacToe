package com.nikzakharenko.crazytictactoe.data

import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase

class RegistrationUseCaseImpl : RegistrationUseCase {
    override fun registration(auth: AuthModel) {
        auth.firebaseAuth.createUserWithEmailAndPassword(auth.email, auth.password!!)
    }
}