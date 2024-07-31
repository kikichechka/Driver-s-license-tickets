package com.example.drivers_license_tickets

interface TicketsRepository {
    suspend fun getCategoryA()
    suspend fun getCategoryB()
}
