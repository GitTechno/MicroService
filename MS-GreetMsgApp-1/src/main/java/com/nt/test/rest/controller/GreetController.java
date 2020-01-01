package com.nt.test.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.test.feignclient.GreetServiceClient;

@RestController
public class GreetController {
   
	@Autowired
	private GreetServiceClient greetClient;
	
	@GetMapping(value="/getMsg/{name}")
	public String getGreetMsg(@PathVariable("name")String name) {
		System.out.println("GreetController.getGreetMsg()");
		
		String welcomeMsg=greetClient.invokeGreetMsg(name);
		
		String greetMsg="Good Evening";
		
		return greetMsg+"======="+welcomeMsg;
	}
}
