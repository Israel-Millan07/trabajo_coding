package com.coding.web.cadenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}
	@RequestMapping ("/")
	public String hello() {
		return "Hola cliente ¿Como estas?";
	}
	@RequestMapping("/random")
	public String mensaje() {
		return "¡Spring Boot es genial! Tan fácil de responder con cadenas";
	}
}
