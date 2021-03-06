package com.nt.test.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="WELCOME-APP-API")
public interface GreetServiceClient {
	
	@RequestMapping(value="/welcome/{name}")
	public String invokeGreetMsg(@PathVariable("name")String name);

}
