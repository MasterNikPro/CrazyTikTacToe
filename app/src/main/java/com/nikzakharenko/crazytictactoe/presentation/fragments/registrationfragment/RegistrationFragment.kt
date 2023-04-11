package com.nikzakharenko.crazytictactoe.presentation.fragments.registrationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.nikzakharenko.crazytictactoe.R
import com.nikzakharenko.crazytictactoe.presentation.fragments.loginfragment.LoginViewModel


class RegistrationFragment : Fragment() {
    private val registrationViewModel by lazy { ViewModelProvider(this)[RegistrationViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view= inflater.inflate(R.layout.fragment_registration, container, false)
        val registrationEmail:EditText=view.findViewById(R.id.registrationEmail)
        val registrationPassword:EditText=view.findViewById(R.id.registrationPassword)
        val registrationButton:Button=view.findViewById(R.id.registrationBtn)

        registrationButton.setOnClickListener {

        }
        return view
    }


}