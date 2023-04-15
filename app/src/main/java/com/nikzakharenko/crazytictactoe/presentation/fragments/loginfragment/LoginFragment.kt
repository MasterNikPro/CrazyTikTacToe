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
import com.nikzakharenko.crazytictactoe.R
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



        return view
    }


}