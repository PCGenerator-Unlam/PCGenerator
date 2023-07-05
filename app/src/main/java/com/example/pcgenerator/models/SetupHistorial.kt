package com.example.pcgenerator.models

import java.time.LocalDate

data class SetupHistorial (
    var nombre : String,
    var tipo: TipoComputadora,
    var fechaCreacion: LocalDate,
    var precio: Int
    )