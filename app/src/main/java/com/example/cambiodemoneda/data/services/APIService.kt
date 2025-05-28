package com.example.cambiodemoneda.data.services

import com.example.cambiodemoneda.data.response.Blue
import com.example.cambiodemoneda.data.response.CCL
import com.example.cambiodemoneda.data.response.Cripto
import com.example.cambiodemoneda.data.response.DolarResponse
import com.example.cambiodemoneda.data.response.MEP
import com.example.cambiodemoneda.data.response.Mayorista
import com.example.cambiodemoneda.data.response.Oficial
import com.example.cambiodemoneda.data.response.Tarjeta
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