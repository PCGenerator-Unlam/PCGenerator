package com.example.pcgenerator.models

class Ram(nombreMarca: String,

          val cantidadDeMemoria:Int,precio:Double=0.0,
          image: Int? =null,): Componentes(TipoDeComponente.RAM,nombreMarca,image,precio){
    override fun descripcion(): String {
        return "${cantidadDeMemoria.toString()} Gb"
    }


}