package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleRestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestSpringBootApplication.class, args);
	}

}

@RestController
class Abcd
{
	@GetMapping("/")
	public String sayHello()
	{
		return "Sayiiiiiiiiiiiinnngggggg Helloooooooooooooo";
	}
}
