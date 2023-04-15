package com.nikzakharenko.crazytictactoe.data

import android.content.Context
import android.util.Log
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase

class LoginUseCaseImpl: LoginUseCase {
    override fun login(auth: AuthModel) {
         try {
            auth.firebaseAuth.signInWithEmailAndPassword(auth.email,auth.password)
        } catch (_:java.lang.Exception){
        }
    }

}


