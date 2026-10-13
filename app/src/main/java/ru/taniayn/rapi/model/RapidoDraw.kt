package ru.taniayn.rapi.model

data class RapidoDraw(
    val drawNumber: Int,
    val numbers: List<Int>,
    val additionalNumber: Int
)