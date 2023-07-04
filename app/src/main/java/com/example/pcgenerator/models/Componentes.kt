package com.example.pcgenerator.models

abstract class Componentes(val tipo:TipoDeComponente,val tituloNombreMarca:String) {
    abstract fun descripcion(int: Int):String
}