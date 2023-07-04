package com.example.pcgenerator.models

class Mother (nombreMarca: String,

              val capacidadTotalDeMemoria:Int,
              val velocidadMaximaDeProsesador:Double,
              precio:Double=0.0,
              image: Int? =null,): Componentes(TipoDeComponente.MOTHER,nombreMarca,image,precio){
    override fun descripcion(): String {
        return """maximo de memoria $capacidadTotalDeMemoria Gb
            |     maximo de procesador $velocidadMaximaDeProsesador GHz
               
        """.trimMargin()
    }
}