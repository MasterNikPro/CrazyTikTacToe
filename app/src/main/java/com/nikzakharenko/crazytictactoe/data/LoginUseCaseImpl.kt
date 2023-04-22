package com.nikzakharenko.crazytictactoe.data

import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase

class LoginUseCaseImpl: LoginUseCase {
    override fun login(auth: AuthModel) {

         try {

            auth.firebaseAuth.signInWithEmailAndPassword(auth.email, auth.password!!)
        } catch (_:java.lang.Exception){
        }
    }

}


