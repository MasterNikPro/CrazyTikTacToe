package com.nikzakharenko.crazytictactoe.auth.fragments.registrationfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nikzakharenko.crazytictactoe.auth.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.RegistrationUseCase
import kotlinx.coroutines.launch

class RegistrationViewModel(private val registrationUseCase: RegistrationUseCase):ViewModel() {

     fun register(auth: AuthModel){
           registrationUseCase.registration(auth)
    }
    override fun onCleared() {
        super.onCleared()
    }
}