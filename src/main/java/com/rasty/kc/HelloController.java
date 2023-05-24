package com.rasty.kc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello Rasty from main-micro!";
	}

    @GetMapping("/name")
	public String getName() {
		return "main-micro here !!";
	}

}