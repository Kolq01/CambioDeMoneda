package com.example.cambiodemoneda.data.response

data class BrazilianReal(
    val compra: Int,
    val venta: Int,
    val casa: String,
    val fecha: String,
    val spread: String,
)
data class PesoUruguayo(
    val compra: Int,
    val venta: Int,
    val casa: String,
    val fecha: String,
    val spread: String,
)
data class PesoChileno(
    val compra: Int,
    val venta: Int,
    val casa: String,
    val fecha: String,
    val spread: String,
)
data class Euro(
    val compra: Int,
    val venta: Int,
    val casa: String,
    val fecha: String,
    val spread: String,
)
