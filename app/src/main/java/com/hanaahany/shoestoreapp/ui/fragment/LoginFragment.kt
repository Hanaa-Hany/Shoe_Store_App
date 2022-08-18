package com.hanaahany.shoestoreapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.hanaahany.shoestoreapp.R
import com.hanaahany.shoestoreapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSignIn.setOnClickListener {

                findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)

            
        }
        binding.btnSignUp.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
    }


}