package com.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SessionController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
