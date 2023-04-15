package com.nikzakharenko.crazytictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nikzakharenko.crazytictactoe.presentation.fragments.registrationfragment.RegistrationFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val vm:MainActivityViewModel by viewModel<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myFragment= RegistrationFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,myFragment).commit()
    }
}