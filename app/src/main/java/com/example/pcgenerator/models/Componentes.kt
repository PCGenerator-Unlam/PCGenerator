package com.example.pcgenerator.models

import android.media.Image

abstract class Componentes(val tipo:TipoDeComponente,val tituloNombreMarca:String,val image:Int?=null) {
    abstract fun descripcion(int: Int):String
}