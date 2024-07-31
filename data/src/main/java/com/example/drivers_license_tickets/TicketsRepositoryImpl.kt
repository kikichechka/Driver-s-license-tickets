package com.example.drivers_license_tickets

import com.example.drivers_license_tickets.datasource.TicketsCategoryADataSource
import com.example.drivers_license_tickets.datasource.TicketsCategoryBDataSource
import com.example.drivers_license_tickets.dto.toModel
import javax.inject.Inject

class TicketsRepositoryImpl @Inject constructor(
    private val ticketsCategoryADataSource: TicketsCategoryADataSource,
    private val ticketsCategoryBDataSource: TicketsCategoryBDataSource
) : TicketsRepository {
    override suspend fun getCategoryA(): List<TicketModel>? {
        return ticketsCategoryADataSource.getData().body()?.map { it.toModel() }
    }

    override suspend fun getCategoryB(): List<TicketModel>? {
        return ticketsCategoryBDataSource.getData().body()?.map { it.toModel() }
    }
}
