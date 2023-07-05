package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentHistorialBinding
import com.example.pcgenerator.databinding.FragmentHomeBinding
import com.example.pcgenerator.models.SetupHistorial
import com.example.pcgenerator.models.TipoComputadora
import com.example.pcgenerator.ui.adapters.HistorialAdapter

class HistorialFragment : Fragment() {

    private var _binding: FragmentHistorialBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHistorialBinding.inflate(inflater, container, false)
        val root: View = _binding!!.root

        var listaComputadoras: MutableList<SetupHistorial> = mutableListOf()

        listaComputadoras.add(SetupHistorial("PC Gaming 2", TipoComputadora.GAMING, "22/06/2023", 200000))
        listaComputadoras.add(SetupHistorial("PC Oficina 1", TipoComputadora.OFICINA, "15/06/2023", 120000))
        listaComputadoras.add(SetupHistorial("PC Diseño 1", TipoComputadora.DISEÑO, "22/06/2023", 220000))
        listaComputadoras.add(SetupHistorial("PC Gaming 1", TipoComputadora.GAMING, "22/06/2023", 450000))
        _binding!!.rvHistorial.adapter = HistorialAdapter(listaComputadoras)
        _binding!!.rvHistorial.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}