package com.nikzakharenko.crazytictactoe.auth.fragments.registrationfragment


import androidx.lifecycle.ViewModel

import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.auth.domain.RegistrationUseCase

class RegistrationViewModel(private val registrationUseCase: RegistrationUseCase,private val checkData: CheckDataUseCase):ViewModel() {

     fun register(auth: AuthModel){
         if(checkData.checkData(auth = auth)){
             registrationUseCase.registration(auth)
         }

    }
    override fun onCleared() {
        super.onCleared()
    }
}