package com.example.pcgenerator.models

import android.media.Image

class Procesador(
    nombreMarca: String,
    val velocidad:Float,
    precio:Double=0.0,
    image: Int? =null


    ):Componentes(TipoDeComponente.PROCESADOR,nombreMarca,image,precio){
    override fun descripcion(): String {
     return "${velocidad.toString()} GHz"
    }

}