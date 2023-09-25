package com.cpt.payments.controllerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   
	@GetMapping("/helloworld")
	public String helloworld() {
		return "helloworld";
		
	}
	@GetMapping("/getworld")
	public String getworld() {
		return "Get world";
	
}
}
