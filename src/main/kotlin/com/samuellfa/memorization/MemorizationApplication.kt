package com.samuellfa.memorization

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemorizationApplication

fun main(args: Array<String>) {
	runApplication<MemorizationApplication>(*args)
}
