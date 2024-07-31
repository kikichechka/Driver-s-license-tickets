package com.example.drivers_license_tickets

data class TicketModel  (
    val title: String,
    val ticketNumber: String,
    val ticketCategory: String,
    val image: String,
    val question: String,
    val answers: List<AnswersModel>,
    val correctAnswer: String,
    val answerTip: String,
    val topic: List<String>,
    val id: String
)