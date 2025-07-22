package com.example.cambiodemoneda.data.model.services

import com.example.cambiodemoneda.data.model.Blue
import com.example.cambiodemoneda.data.model.CCL
import com.example.cambiodemoneda.data.model.Cripto
import com.example.cambiodemoneda.data.model.DolarResponse
import com.example.cambiodemoneda.data.model.MEP
import com.example.cambiodemoneda.data.model.Mayorista
import com.example.cambiodemoneda.data.model.Oficial
import com.example.cambiodemoneda.data.model.Tarjeta
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("v1/dolares")
    suspend fun getDolarByType(): Response<DolarResponse>

    @GET("v1/dolares/blue")
    suspend fun getDolarBlue(): Response<Blue>

    @GET("v1/dolares/oficial")
    suspend fun getDolarOficial(): Response<Oficial>

    @GET("v1/dolares/bolsa")
    suspend fun getDolarMep(): Response<MEP>

    @GET("v1/dolares/contadoconliqui")
    suspend fun getDolarCCL(): Response<CCL>

    @GET("v1/dolares/mayorista")
    suspend fun getDolarMayorista(): Response<Mayorista>

    @GET("v1/dolares/cripto")
    suspend fun getDolarCripto(): Response<Cripto>

    @GET("v1/dolares/tarjeta")
    suspend fun getDolarTarjeta(): Response<Tarjeta>

}