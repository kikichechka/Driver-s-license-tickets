package com.example.drivers_license_tickets.datasource

import com.example.drivers_license_tickets.MyRetrofit
import com.example.drivers_license_tickets.dto.TicketDTO
import retrofit2.Response
import javax.inject.Inject

class TicketsCategoryADataSource @Inject constructor(
    private val myRetrofit: MyRetrofit
) {

    suspend fun getData(): Response<List<TicketDTO>> {
        return myRetrofit.searchData.getA()
    }
}