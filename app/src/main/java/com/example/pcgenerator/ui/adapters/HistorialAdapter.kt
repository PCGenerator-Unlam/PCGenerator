package com.example.pcgenerator.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pcgenerator.databinding.HistorialItemBinding
import com.example.pcgenerator.models.SetupHistorial

class HistorialAdapter(var historialList : MutableList<SetupHistorial>
) : RecyclerView.Adapter<HistorialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistorialViewHolder {
        val historialItemBinding = HistorialItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return HistorialViewHolder(historialItemBinding);
    }

    override fun onBindViewHolder(holder: HistorialViewHolder, position: Int) {
            var setup = historialList[position]

            holder.binding.nombre.text = setup.nombre

    }

    override fun getItemCount(): Int = historialList.size
}

class HistorialViewHolder(val binding : HistorialItemBinding) : RecyclerView.ViewHolder(binding.root)