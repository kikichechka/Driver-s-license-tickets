package com.example.drivers_license_tickets.dto

import com.example.drivers_license_tickets.AnswersModel
import com.google.gson.annotations.SerializedName

data class AnswersDTO(
    @SerializedName("answer_text") val answerText: String,
    @SerializedName("is_correct") val isCorrect: Boolean
)

fun AnswersDTO.toModel(): AnswersModel {
    return AnswersModel(
        answerText = answerText,
        isCorrect = isCorrect
    )
}
