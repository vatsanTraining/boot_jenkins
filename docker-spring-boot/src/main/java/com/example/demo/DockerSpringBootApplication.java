package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

	@GetMapping(path = "/greet")
	public String getMessage() {
		
		System.out.println("Hello world");
		
		return "Hello from docker app";
	}
}
