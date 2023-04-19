package com.nikzakharenko.crazytictactoe.auth.domain

import android.provider.ContactsContract.CommonDataKinds.Email
import com.google.firebase.auth.FirebaseAuth

data class AuthModel(val email: String,val password:String,val firebaseAuth: FirebaseAuth)
