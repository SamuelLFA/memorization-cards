package com.samuellfa.memorization.newCard

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class CardForm (

    @Size(min = 1, max = 100) @NotBlank
    val originalText: String,
    @Size(min = 1, max = 100) @NotBlank
    val translatedText: String
) {
    fun toModel(): Card {
        return Card(
            id = null,
            originalText = originalText,
            translatedText = translatedText
        )
    }
}