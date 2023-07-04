package com.example.pcgenerator.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.echo.holographlibrary.Bar
import com.example.pcgenerator.databinding.FragmentGraficosBinding
import com.example.pcgenerator.models.Procesador

class FragmentGrafico : Fragment(){

    private var _binding: FragmentGraficosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGraficosBinding.inflate(inflater, container, false)

        cargargraficos(2)
        return binding.root
    }

    private fun cargargraficos(cantidadEquipos : Int){
        val barras = ArrayList<Bar>()

        val procesadores = ArrayList<Procesador>();
        val coloresBarras = ArrayList<String>();
        procesadores.add(Procesador("Ryzen 5 PRO 4650G", 4.00F))
        procesadores.add(Procesador("Ryzen 3 PRO 4350G", 3.85F))
        procesadores.add(Procesador("Ryzen 7", 4.65F))
        coloresBarras.add("#6AE587")
        coloresBarras.add("#FFBB86FC")
        coloresBarras.add("#FF6200EE")
        coloresBarras.add("#EDB85B")

        var contador = 0;
        for(procesador in procesadores){
                val barra = Bar()
                barra.color = Color.parseColor(coloresBarras[contador])
                barra.name = procesador.tituloNombreMarca
                barra.value = procesador.velocidad
                barras.add(barra)
                contador++
        }
        binding.graficosComponentes.bars = barras;
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}