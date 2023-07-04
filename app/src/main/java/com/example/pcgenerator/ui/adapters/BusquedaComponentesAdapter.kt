package com.example.pcgenerator.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pcgenerator.databinding.BusquedaItemBinding
import com.example.pcgenerator.databinding.HistorialItemBinding
import com.example.pcgenerator.models.Componentes
import com.example.pcgenerator.models.SetupHistorial

class BusquedaComponentesAdapter(var componentesList : MutableList<Componentes>
) : RecyclerView.Adapter<BusquedaComponentesAdapter.BusquedaComponentesViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):BusquedaComponentesViewHolder{
            val componentesBinding= BusquedaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

            return BusquedaComponentesViewHolder(componentesBinding);
        }

    override fun onBindViewHolder(holder: BusquedaComponentesViewHolder, position: Int) {
        val component=componentesList[position]
        holder.binding.imImagencomponente
    }


    override fun getItemCount(): Int = componentesList.size


    class BusquedaComponentesViewHolder(val binding:BusquedaItemBinding) : RecyclerView.ViewHolder(binding.root)
}