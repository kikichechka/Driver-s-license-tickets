package com.example.drivers_license_tickets

interface TicketsRepository {
    suspend fun getCategoryA(): List<TicketModel>?
    suspend fun getCategoryB(): List<TicketModel>?
}
