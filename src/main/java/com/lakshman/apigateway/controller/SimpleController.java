package com.lakshman.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gateway")
public class SimpleController {

	@GetMapping
	public String welcome() {
		return "Welcome to the API Gateway!";
	}
}
