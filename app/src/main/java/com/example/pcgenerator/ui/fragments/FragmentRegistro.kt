package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentRegistroBinding
import com.example.pcgenerator.repository.UsersRepository

class FragmentRegistro : Fragment(){

    private var _binding: FragmentRegistroBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistroBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var usuarioInput: String = ""
        var contraseniaInput: String = ""
        var contraseniaRepInput: String = ""

        binding.buttonRegistro.setOnClickListener{
            usuarioInput = binding.inputUsuarioRegistro.text.toString()
            contraseniaInput = binding.inputContraseARegistro.text.toString()
            contraseniaRepInput = binding.inputContraseARepetida.text.toString()



            if(usuarioInput.isNotBlank() && contraseniaInput.isNotBlank() && contraseniaRepInput.equals(contraseniaInput)){
                if(UsersRepository.checkValidUser(usuarioInput)){
                    UsersRepository.addUser(usuarioInput,contraseniaInput)
                    findNavController().navigate(R.id.action_fragmentRegistro_to_fragmentLogin)
                }else{
                    Toast.makeText(activity,"El usuario ya existe",Toast.LENGTH_SHORT).show()
                }
            }else if(usuarioInput.isBlank() || contraseniaInput.isBlank()){
                Toast.makeText(activity,"Completar todos los datos",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(activity,"La contraseña ingresada no es la misma",Toast.LENGTH_SHORT).show()
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}