package com.example.drivers_license_tickets

import com.example.drivers_license_tickets.dto.TicketDTO
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import javax.inject.Inject

private const val BASE_URL = "https://comandosfru.xyz/pdd/tickets"

class MyRetrofit @Inject constructor() {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val searchData: SearchDataApi = retrofit.create(SearchDataApi::class.java)
}

interface SearchDataApi {
    @GET("/ticket1.json")
    suspend fun getA(): Response<List<TicketDTO>>

    @GET("/ticket2.json ")
    suspend fun getB(): Response<List<TicketDTO>>
}