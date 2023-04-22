package com.nikzakharenko.crazytictactoe.fragments.auth.registrationfragment


import androidx.lifecycle.ViewModel

import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase

class RegistrationViewModel(private val registrationUseCase: RegistrationUseCase, private val checkData: CheckDataUseCase):ViewModel() {

     fun register(auth: AuthModel){
         if(checkData.checkData(auth = auth)){
             registrationUseCase.registration(auth)
         }

    }
    override fun onCleared() {
        super.onCleared()
    }
}