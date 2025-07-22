package com.example.cambiodemoneda.data.model.services

import com.example.cambiodemoneda.data.model.BrazilianReal
import com.example.cambiodemoneda.data.model.Euro
import com.example.cambiodemoneda.data.model.PesoChileno
import com.example.cambiodemoneda.data.model.PesoUruguayo
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