package com.nikzakharenko.crazytictactoe.auth.fragments.recoveryfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseAuth
import com.nikzakharenko.crazytictactoe.R
import com.nikzakharenko.crazytictactoe.auth.domain.AuthModel
import com.nikzakharenko.crazytictactoe.auth.fragments.loginfragment.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class RecoveryFragment : Fragment() {
    private val recoveryViewModel by viewModel<RecoveryViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view= inflater.inflate(R.layout.fragment_recovery, container, false)
        val recoveryEmail:EditText= view.findViewById(R.id.recoveryEmail)
        val recoveryButton: Button = view.findViewById(R.id.recoveryButton)
        recoveryButton.setOnClickListener {
            recoveryViewModel.recovery(authModel = AuthModel(email = recoveryEmail.text.toString(), firebaseAuth = FirebaseAuth.getInstance(), password = null))
        }
        return view
    }


}