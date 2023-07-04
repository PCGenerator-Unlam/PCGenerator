package com.example.pcgenerator.models

class Ssd(nombreMarca: String,

          val cantidadDeMemoria:Int,precio:Double=0.0,
          image: Int? =null,): Componentes(TipoDeComponente.SSD,nombreMarca,image,precio){
    override fun descripcion(): String {
        return "${cantidadDeMemoria.toString()} Gb"
    }
}