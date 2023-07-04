package com.example.pcgenerator.models

class Procesador (
    nombreMarca: String,

val velocidad:Float
        ):Componentes(TipoDeComponente.PROCESADOR,nombreMarca){
    override fun descripcion(int: Int): String {
     return "${velocidad.toString()} GHz"
    }

}