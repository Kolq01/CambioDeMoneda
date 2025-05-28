package com.example.cambiodemoneda.data.response

data class DolarResponse(
    val CCL: CCL,
    val Cripto: Cripto,
    val MEP: MEP,
    val Mayorista: Mayorista,
    val Tarjeta: Tarjeta,
    val Blue: Blue,
    val Oficial: Oficial
)

data class Blue(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class CCL(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class Cripto(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class Mayorista(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class MEP(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class Oficial(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)

data class Tarjeta(
    val moneda: String,
    val casa: String,
    val fecha: String,
    val compra: String,
    val venta: String
)