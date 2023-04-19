package com.nikzakharenko.crazytictactoe.auth.fragments.recoveryfragment

import androidx.lifecycle.ViewModel
import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.domain.RecoveryUseCase

class RecoveryViewModel(private val recoveryUseCase: RecoveryUseCase):ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }
    fun recovery(authModel: AuthModel){
        recoveryUseCase.recovery(authModel)

    }
}