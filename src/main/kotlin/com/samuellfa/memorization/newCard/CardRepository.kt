package com.samuellfa.memorization.newCard

import org.springframework.data.jpa.repository.JpaRepository

interface CardRepository: JpaRepository<Card, Long>