package com.nikzakharenko.crazytictactoe.fragments.splashfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.nikzakharenko.crazytictactoe.R


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view:View= inflater.inflate(R.layout.fragment_splash, container, false)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.splash).into(imageView)
            view.postDelayed({findNavController().navigate(R.id.action_splashFragment_to_loginFragment,null)},4500)
        return view
    }


}