package com.example.pcgenerator.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pcgenerator.databinding.FragmentBusquedaComponentesBinding
import com.example.pcgenerator.models.Componentes
import com.example.pcgenerator.ui.adapters.BusquedaComponentesAdapter


/**
 * A simple [Fragment] subclass.
 * Use the [BusquedaComponentesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BusquedaComponentesFragment : Fragment() {
    private var binding: FragmentBusquedaComponentesBinding? = null
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val ARG_PARAM1 = "param1"
    private val ARG_PARAM2 = "param2"

    private val args by navArgs<BusquedaComponentesFragmentArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBusquedaComponentesBinding.inflate(inflater, container, false)

        var listaComponentes: MutableList<Componentes> = mutableListOf()
        binding!!.tvComponenteBuscado.text = args.componenteBuscado
        val root: View = binding!!.root
/*
        listaComponentes.add(Componentes("AMD Ryzen 3", 2, 80.000))
        listaComponentes.add(Componentes("AMD Ryzen 5", 2, 90.000))
        listaComponentes.add(Componentes("Intel I5", 2, 120.000))
        listaComponentes.add(Componentes("AMD Ryzen 7", 2, 160.000))
        binding!!.recyclerBusquedaComponentes.adapter = BusquedaComponentesAdapter(listaComponentes)
        binding!!.recyclerBusquedaComponentes.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL,false)
            */
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BusquedaComponentesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BusquedaComponentesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}