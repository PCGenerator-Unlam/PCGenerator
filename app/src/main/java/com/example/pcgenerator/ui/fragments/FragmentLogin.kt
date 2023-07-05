package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentLoginBinding
import com.example.pcgenerator.repository.UsersRepository

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

        var usuarioInput: String = ""
        var passwordInput: String = ""

        binding.buttonIniciarSesion.setOnClickListener{
            usuarioInput = binding.inputUsuario.text.toString()
            passwordInput = binding.inputContrasenia.text.toString()
            if(UsersRepository.checkLogIn(usuarioInput,passwordInput)){
                findNavController().navigate(R.id.action_fragmentLogin_to_navigation_home)
            }else{
                Toast.makeText(activity,"Los datos son incorrectos",Toast.LENGTH_SHORT).show()
            }

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