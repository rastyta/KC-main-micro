package com.rasty.kc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${message.value}")
	private String message;

	@GetMapping("/")
	public String index() {
		return "Hello Rasty from main-micro! **";
	}

    @GetMapping("/message")
	public String getName() {
		return message;
	}

}