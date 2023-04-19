package com.nikzakharenko.crazytictactoe.presentation.fragments.loginfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.R
import com.nikzakharenko.crazytictactoe.di.loginModule
import com.nikzakharenko.crazytictactoe.domain.AuthModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {
    private val loginViewModel by viewModel<LoginViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        val loginEditText: EditText = view.findViewById(R.id.loginEmail)
        val passwordEditText:EditText=view.findViewById(R.id.loginPassword)
        val loginButton:Button= view.findViewById(R.id.loginBtn)
        val loginRegistration:TextView= view.findViewById(R.id.loginRegistration)
        val loginRecovery:TextView= view.findViewById(R.id.loginRecovery)
        loginButton.setOnClickListener {
            loginViewModel.login(auth= AuthModel(
                email = loginEditText.text.toString(),
                password = passwordEditText.text.toString(),
                firebaseAuth = FirebaseAuth.getInstance()
            ))
        }
        loginRegistration.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment,null)
        }
        loginRecovery.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_recoveryFragment,null)
        }
        return view
    }


}