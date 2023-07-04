package com.example.pcgenerator.models

class TarjetaGrafica(   nombreMarca: String,
                        precio:Double=0.0,
                        image: Int? =null,
                        val cantidadDeRam:Int,

                        ):Componentes(TipoDeComponente.PROCESADOR,nombreMarca,image,precio){
    override fun descripcion(): String {
        return "${cantidadDeRam.toString()} Gb"
    }
}