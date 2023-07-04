package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentLoginBinding

class FragmentLogin : Fragment(){

    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonIniciarSesion.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentLogin_to_navigation_home)
        }
        binding.buttonRegistrarme.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentRegistro)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}