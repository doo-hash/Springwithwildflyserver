package com.springpractices.Springwithwildflyserver.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String Hellomethod() {
		return "index";
	}
}
