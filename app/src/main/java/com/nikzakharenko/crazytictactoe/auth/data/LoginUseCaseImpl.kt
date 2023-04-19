package com.nikzakharenko.crazytictactoe.auth.data

import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.LoginUseCase

class LoginUseCaseImpl: LoginUseCase {
    override fun login(auth: AuthModel) {
         try {
            auth.firebaseAuth.signInWithEmailAndPassword(auth.email, auth.password!!)
        } catch (_:java.lang.Exception){
        }
    }

}


