package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentLoginBinding
import com.example.pcgenerator.databinding.FragmentNuevaComputadoraBinding

class NuevaComputadoraFragment : Fragment() {
    private var _binding: FragmentNuevaComputadoraBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nueva_computadora, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}