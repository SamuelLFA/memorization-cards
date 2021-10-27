package com.samuellfa.memorization.readCard

import com.fasterxml.jackson.annotation.JsonProperty
import com.samuellfa.memorization.newCard.Card

data class CardDTO (

    @JsonProperty(value = "front")
    val front: String,
    @JsonProperty(value = "back")
    val back: String
) {
    constructor(card: Card) : this(
        front = card.front,
        back = card.back
    )
}