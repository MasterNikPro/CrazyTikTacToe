package com.nikzakharenko.crazytictactoe.data

import android.content.Context
import android.widget.Toast
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import com.nikzakharenko.crazytictactoe.domain.CheckDataUseCase

class CheckDataUseCaseImpl(private val context: Context): CheckDataUseCase {
    override fun checkData(auth: AuthModel): Boolean {
        if (!isValidEmail(auth.email)) {
            showToast("Incorrect  email")
            return false
        }
        if(auth.password!=null){
            if (!isValidPassword(auth.password)) {
                showToast("Incorrect  password")
                return false
            }
        }

        return true
    }
    private fun isValidEmail(email: String): Boolean {
        return email.contains("@")
    }

    private fun isValidPassword(password: String): Boolean {
        return password.length >= 8
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}