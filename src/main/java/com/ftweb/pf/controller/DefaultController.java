package com.ftweb.pf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DefaultController {

	@GetMapping("/hello")
	public String defaultDisp() {
		return "Hello World!";
	}
	
}
