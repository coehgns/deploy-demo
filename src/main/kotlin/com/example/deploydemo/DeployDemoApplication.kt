package com.example.deploydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeployDemoApplication

fun main(args: Array<String>) {
	runApplication<DeployDemoApplication>(*args)
}
