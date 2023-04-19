package com.nikzakharenko.crazytictactoe.auth.fragments.loginfragment

import androidx.lifecycle.ViewModel
import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.LoginUseCase

class LoginViewModel(private val loginUseCase: LoginUseCase): ViewModel() {


    fun login(auth: AuthModel){
        loginUseCase.login(auth)
    }

    override fun onCleared() {
        super.onCleared()
    }
}