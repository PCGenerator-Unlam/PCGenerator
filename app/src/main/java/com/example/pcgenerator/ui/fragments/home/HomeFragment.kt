package com.example.pcgenerator.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pcgenerator.databinding.FragmentHomeBinding
import com.example.pcgenerator.databinding.FragmentLoginBinding
import com.example.pcgenerator.models.SetupHistorial
import com.example.pcgenerator.ui.adapters.HistorialAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root
/*
        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

 */
        var listaCompus : MutableList<SetupHistorial> = mutableListOf()
        for(i in 1..10){
            listaCompus.add(SetupHistorial("Computadora $i"))
        }
        var historialAdapter : HistorialAdapter = HistorialAdapter(listaCompus)
/*
        binding.recyclerHistorial.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerHistorial.adapter = historialAdapter;
*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}