package com.samuellfa.memorization.newCard

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class CardForm (

    @Size(min = 1, max = 250) @NotBlank
    val front: String,
    @Size(min = 1, max = 250) @NotBlank
    val back: String
) {
    fun toModel(): Card {
        return Card(
            id = null,
            front = front,
            back = back
        )
    }
}