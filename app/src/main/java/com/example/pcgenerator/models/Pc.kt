package com.example.pcgenerator.models

class Pc(val tipoDePc:TipoDePc=TipoDePc.LIBRE,var prosesador:Procesador?=null,var memoria:Ram?=null, var mother:Mother?=null,var placa:TarjetaGrafica?=null) {
}