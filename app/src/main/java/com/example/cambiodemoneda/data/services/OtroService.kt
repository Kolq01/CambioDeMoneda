package com.example.cambiodemoneda.data.services

import com.example.cambiodemoneda.data.response.BrazilianReal
import com.example.cambiodemoneda.data.response.Euro
import com.example.cambiodemoneda.data.response.PesoChileno
import com.example.cambiodemoneda.data.response.PesoUruguayo
import retrofit2.Response
import retrofit2.http.GET

interface OtroService {

    @GET("euro")
    suspend fun getEuro(): Response<Euro>

    @GET("real")
    suspend fun getReal(): Response<BrazilianReal>

    @GET("clp")
    suspend fun getChileanPeso(): Response<PesoChileno>

    @GET("uru")
    suspend fun getUruguayanPeso(): Response<PesoUruguayo>
}