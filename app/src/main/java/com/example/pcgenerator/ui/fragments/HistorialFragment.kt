package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentHistorialBinding
import com.example.pcgenerator.models.SetupHistorial
import com.example.pcgenerator.ui.adapters.HistorialAdapter

class HistorialFragment : Fragment() {

    private var _binding: FragmentHistorialBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var listaComputadoras: MutableList<SetupHistorial> = mutableListOf()

        /*binding.rvHistorial.adapter = HistorialAdapter(listaComputadoras)
        binding.rvHistorial.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        */

        return inflater.inflate(R.layout.fragment_historial, container, false)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}