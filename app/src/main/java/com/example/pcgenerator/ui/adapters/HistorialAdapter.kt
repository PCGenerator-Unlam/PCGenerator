package com.example.pcgenerator.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.ItemHistorialBinding
import com.example.pcgenerator.models.SetupHistorial
import com.example.pcgenerator.models.TipoComputadora

class HistorialAdapter(var historialList : MutableList<SetupHistorial>
) : RecyclerView.Adapter<HistorialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistorialViewHolder {
        val historialItemBinding = ItemHistorialBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return HistorialViewHolder(historialItemBinding);
    }

    override fun onBindViewHolder(holder: HistorialViewHolder, position: Int) {
            var setup = historialList[position]
        holder.binding.tvName.text = setup.nombre
        holder.binding.fecha.text = setup.fechaCreacion.toString()
        holder.binding.tvPrice.text = "$${setup.precio}"
        holder.binding.imagen.setImageResource(
            when(setup.tipo)
            {
            TipoComputadora.GAMING -> R.drawable.mando
            TipoComputadora.DISEÑO -> R.drawable.desing
            TipoComputadora.OFICINA -> R.drawable.office
            TipoComputadora.LIBRE -> R.drawable.lupa
        }
        )

    }

    override fun getItemCount(): Int = historialList.size
}

class HistorialViewHolder(val binding : ItemHistorialBinding) : RecyclerView.ViewHolder(binding.root)