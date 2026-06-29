package com.example.demo_buildpacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController // 1. Le decimos al Srping que esto es un API REST
public class DemoBuildpacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBuildpacksApplication.class, args);
		
	}

	@GetMapping("/saludo") // 2.- Creamos la ruta web http://localhost:8080/saludo
	public String holaMundo() {
		return "¡Felicidades Luis! Tur proyecto de Spring Boot arrancó con éxito :).";

	}

}
