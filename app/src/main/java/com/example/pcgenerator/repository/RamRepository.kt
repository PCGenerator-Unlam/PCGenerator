package com.example.pcgenerator.repository

import com.example.pcgenerator.R
import com.example.pcgenerator.models.Ram

object  RamRepository {
    private val rams:MutableList<Ram> =mutableListOf()
init {
    val ram1=Ram("Memoria Ram marca Kingston Fury DD4",16,22.099, R.drawable.dise_o_sin_t_tulo__1__removebg_preview__1_)
}

fun getRams(): List<Ram> {
    return rams
}
    fun addRam(ram:Ram):Boolean{
        return rams.add(ram)
    }
}