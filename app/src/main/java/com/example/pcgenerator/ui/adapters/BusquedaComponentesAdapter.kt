package com.example.pcgenerator.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pcgenerator.R
import com.example.pcgenerator.databinding.BusquedaItemBinding
import com.example.pcgenerator.models.Componentes

class BusquedaComponentesAdapter(
    var componentesList: MutableList<Componentes>,
   val navController: NavController
) : RecyclerView.Adapter<BusquedaComponentesAdapter.BusquedaComponentesViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):BusquedaComponentesViewHolder{
            val componentesBinding= BusquedaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

            return BusquedaComponentesViewHolder(componentesBinding);
        }

    override fun onBindViewHolder(holder: BusquedaComponentesViewHolder, position: Int) {
        val component=componentesList[position]
        if(component.image!=null){
        holder.binding.imImagencomponente.setImageResource(component.image)}
    holder.binding.tvTitulocomponente.setText(component.tituloNombreMarca)
    holder.binding.tvDescripcion.setText(component.descripcion())
    holder.binding.tvPrecio.setText(component.precio.toString())
        holder.binding.imImagencomponente.setOnClickListener {
         navController.navigate(R.id.action_busquedaComponentesFragment_to_fragment_eleccion_de_componente)
        }
    }


    override fun getItemCount(): Int = componentesList.size


    class BusquedaComponentesViewHolder(val binding:BusquedaItemBinding) : RecyclerView.ViewHolder(binding.root)
}