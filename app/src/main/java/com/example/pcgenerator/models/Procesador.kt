package com.example.pcgenerator.models

import android.media.Image

class Procesador(
    nombreMarca: String,
    precio:Double=0.0,
    image: Int? =null,
    val velocidad:Float,

    ):Componentes(TipoDeComponente.PROCESADOR,nombreMarca,image,precio){
    override fun descripcion(int: Int): String {
     return "${velocidad.toString()} GHz"
    }

}