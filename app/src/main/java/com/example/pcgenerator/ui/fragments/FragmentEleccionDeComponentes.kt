package com.example.pcgenerator.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.FragmentEleccionDeComponenteBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentEleccionDeComponentes.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentEleccionDeComponentes : Fragment() {
    // TODO: Rename and change types of parameters

    private var param1: String? = null
    private var param2: String? = null

    private  val ARG_PARAM1 = "param1"
    private  val ARG_PARAM2 = "param2"
lateinit var  binding: FragmentEleccionDeComponenteBinding
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

        binding = FragmentEleccionDeComponenteBinding.inflate(inflater, container, false)

        binding.btTgraficaComponentes.setOnClickListener{
            val action = FragmentEleccionDeComponentesDirections.actionFragmentEleccionDeComponenteToBusquedaComponentesFragment("Tarjeta Grafica")
            findNavController().navigate(action)
        }
        binding.btRamComponentes.setOnClickListener{
            val action = FragmentEleccionDeComponentesDirections.actionFragmentEleccionDeComponenteToBusquedaComponentesFragment("Memorias Ram")
            findNavController().navigate(action)
        }
        binding.btMotherComponentes.setOnClickListener{
            val action = FragmentEleccionDeComponentesDirections.actionFragmentEleccionDeComponenteToBusquedaComponentesFragment("Tarjeta Madre")
            findNavController().navigate(action)
        }
        binding.btProcesadorComponentes.setOnClickListener{
            val action = FragmentEleccionDeComponentesDirections.actionFragmentEleccionDeComponenteToBusquedaComponentesFragment("Procesadores")
            findNavController().navigate(action)
        }
        binding.btSsdComponentes.setOnClickListener{
            val action = FragmentEleccionDeComponentesDirections.actionFragmentEleccionDeComponenteToBusquedaComponentesFragment("Discos Solidos")
            findNavController().navigate(action)
        }

        binding.btVerpcComponentes.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_eleccion_de_componente_to_fragmentEquiposArmados)
        }
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btMotherComponentes.setOnClickListener {
  binding.btMotherComponentes.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,
      R.drawable.marque_el_circulo,0)

          val  tipo = "MOTHER"
          val  bundle = bundleOf("tipo" to tipo)
            findNavController().navigate(R.id.action_fragment_eleccion_de_componente_to_busquedaComponentesFragment,bundle)
        }


    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_eleccion_de_componente.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentEleccionDeComponentes().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}