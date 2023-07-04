package com.example.pcgenerator.models

class Ram(nombreMarca: String,

          val cantidadDeMemoria:Int): Componentes(TipoDeComponente.RAM,nombreMarca){
    override fun descripcion(int: Int): String {
        return "${cantidadDeMemoria.toString()} Gb"
    }


}