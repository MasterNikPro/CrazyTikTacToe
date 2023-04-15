package com.nikzakharenko.crazytictactoe.presentation.fragments.registrationfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nikzakharenko.crazytictactoe.data.RegistrationUseCaseImpl
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.RegistrationUseCase
import kotlinx.coroutines.launch

class RegistrationViewModel(private val registrationUseCase: RegistrationUseCase):ViewModel() {

    private val registrationMutableData = MutableLiveData<Unit>()
     val registrationData:LiveData<Unit> = registrationMutableData


     fun register(auth: AuthModel){
           registrationUseCase.registration(auth)
    }
    override fun onCleared() {
        super.onCleared()
    }
}