package com.example.pcgenerator.models

class Procesador(
    nombreMarca: String,
    val velocidad: Double,
    precio:Double=0.0,
    image: Int? =null


    ):Componentes(TipoDeComponente.PROCESADOR,nombreMarca,image,precio){
    override fun descripcion(): String {
     return "${velocidad.toString()} GHz"
    }

}