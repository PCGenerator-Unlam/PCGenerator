package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentEquiposArmadosBinding

class FragmentEquiposArmados : Fragment(){

    private var _binding: FragmentEquiposArmadosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEquiposArmadosBinding.inflate(inflater, container, false)

        binding.buttonComparar.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentEquiposArmados_to_fragmentGrafico)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}