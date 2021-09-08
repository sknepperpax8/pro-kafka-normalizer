package com.pax8.pro.streams.normalizer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaNormalizerApplication

fun main(args: Array<String>) {
	runApplication<KafkaNormalizerApplication>(*args)
}
