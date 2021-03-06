package com.samuellfa.memorization.newCard

import com.fasterxml.jackson.annotation.JsonProperty

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