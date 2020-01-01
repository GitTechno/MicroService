package com.nt.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
     
	@GetMapping(value="/welcome/{name}")
	public String getWelcomeMsg(@PathVariable("name")String name) {
		return name+"Welcome To MicroServices";
	}
	
}
