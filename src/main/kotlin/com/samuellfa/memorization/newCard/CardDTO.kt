package com.samuellfa.memorization.newCard

import com.fasterxml.jackson.annotation.JsonProperty

data class CardDTO (

    @JsonProperty(value = "originalText")
    val originalText: String,
    @JsonProperty(value = "translatedText")
    val translatedText: String
) {
    constructor(card: Card) : this(
        originalText = card.originalText,
        translatedText = card.translatedText
    )
}