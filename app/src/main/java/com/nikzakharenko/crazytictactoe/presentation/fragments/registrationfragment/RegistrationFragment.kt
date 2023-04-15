package com.nikzakharenko.crazytictactoe.presentation.fragments.registrationfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.R
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import kotlinx.coroutines.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class RegistrationFragment : Fragment() {
    private val registrationViewModel by viewModel<RegistrationViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_registration, container, false)
        val registrationEmail: EditText = view.findViewById(R.id.registrationEmail)
        val registrationPassword: EditText = view.findViewById(R.id.registrationPassword)
        val registrationButton: Button = view.findViewById(R.id.registrationBtn)
        registrationButton.setOnClickListener {
                registrationViewModel.register(
                AuthModel(
                    email = registrationEmail.text.toString(),
                    password = registrationPassword.text.toString(),
                    firebaseAuth = FirebaseAuth.getInstance()
                )
            )




            }


        return view

    }
}