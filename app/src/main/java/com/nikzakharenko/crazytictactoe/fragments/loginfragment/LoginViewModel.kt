package com.nikzakharenko.crazytictactoe.fragments.loginfragment

import androidx.lifecycle.ViewModel
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.domain.LoginUseCase

class LoginViewModel(private val loginUseCase: LoginUseCase, private val checkDataUseCase: CheckDataUseCase): ViewModel() {


    fun login(auth: AuthModel){
        if(checkDataUseCase.checkData(auth = auth))
        {
            loginUseCase.login(auth)
        }

    }

    override fun onCleared() {
        super.onCleared()
    }
}