package com.nikzakharenko.crazytictactoe.fragments.recoveryfragment

import androidx.lifecycle.ViewModel
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.CheckDataUseCase
import com.nikzakharenko.crazytictactoe.domain.RecoveryUseCase

class RecoveryViewModel(
    private val recoveryUseCase: RecoveryUseCase,
    private val checkData: CheckDataUseCase
) : ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }

    fun recovery(auth: AuthModel) {
        if (checkData.checkData(auth = auth)) {
            recoveryUseCase.recovery(auth)
        }

    }
}