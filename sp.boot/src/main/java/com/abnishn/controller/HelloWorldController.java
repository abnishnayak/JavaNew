package com.abnishn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello world, have a nice day.";
	}
}