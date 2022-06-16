package com.goalabs.ghaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GhactionApplication

fun main(args: Array<String>) {
	runApplication<GhactionApplication>(*args)
}
