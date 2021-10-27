package com.samuellfa.memorization.readCard

import com.samuellfa.memorization.newCard.CardDTO
import com.samuellfa.memorization.newCard.CardRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cards")
class GetCardController(
    private val repository: CardRepository
) {

    @GetMapping("/{id}")
    fun show(@PathVariable id: Long): ResponseEntity<CardDTO> {
        val model = repository.findById(id)

        return model.map {
            val dto = CardDTO(it)
            ResponseEntity.status(HttpStatus.OK).body(dto)
        }.orElse(ResponseEntity.notFound().build())
    }
}