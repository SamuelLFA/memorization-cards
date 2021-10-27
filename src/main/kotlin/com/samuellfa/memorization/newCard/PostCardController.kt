package com.samuellfa.memorization.newCard

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/cards")
class PostCardController(
    private val repository: CardRepository
) {

    @PostMapping
    fun save(@Valid @RequestBody request: CardForm, uriBuilder: UriComponentsBuilder): ResponseEntity<CardDTO> {
        val model = request.toModel()
        repository.save(model)

        val dto = CardDTO(model)
        val uri = uriBuilder.path("/cards/{id}").buildAndExpand(model.id).toUri()
        return ResponseEntity.created(uri).body(dto)
    }
}