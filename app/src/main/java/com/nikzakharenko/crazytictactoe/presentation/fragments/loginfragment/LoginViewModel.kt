package com.nikzakharenko.crazytictactoe.presentation.fragments.loginfragment

import androidx.lifecycle.ViewModel
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase

class LoginViewModel(private val loginUseCase:LoginUseCase): ViewModel() {


    fun login(auth: AuthModel){
        loginUseCase.login(auth)
    }

    override fun onCleared() {
        super.onCleared()
    }
}