package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentNuevaComputadoraBinding
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.databinding.FragmentHomeBinding

class NuevaComputadoraFragment : Fragment() {
    private var _binding: FragmentNuevaComputadoraBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentNuevaComputadoraBinding.inflate(inflater, container, false)

        binding.btnPcGaming.setOnClickListener{
            findNavController().navigate(R.id.action_nuevaComputadoraFragment_to_fragment_eleccion_de_componente)
        }
        binding.btnPcProgra.setOnClickListener{
            findNavController().navigate(R.id.action_nuevaComputadoraFragment_to_fragment_eleccion_de_componente)
        }
        binding.btnPcDesing.setOnClickListener{
            findNavController().navigate(R.id.action_nuevaComputadoraFragment_to_fragment_eleccion_de_componente)
        }
        binding.btnPcOffice.setOnClickListener{
            findNavController().navigate(R.id.action_nuevaComputadoraFragment_to_fragment_eleccion_de_componente)
        }
        binding.btnPcCustom.setOnClickListener{
            findNavController().navigate(R.id.action_nuevaComputadoraFragment_to_fragment_eleccion_de_componente)
        }

        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}