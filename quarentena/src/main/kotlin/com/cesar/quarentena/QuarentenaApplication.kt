package com.cesar.quarentena

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuarentenaApplication

fun main(args: Array<String>) {
	runApplication<QuarentenaApplication>(*args)
}
