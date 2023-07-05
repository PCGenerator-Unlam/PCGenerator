package com.example.pcgenerator.models

abstract class Componentes(
    val tipoDeComponente: TipoDeComponente,
    val tituloNombreMarca:String,
    val image: Int?=null,
    val precio: Double=0.0) {
    abstract fun descripcion():String
}