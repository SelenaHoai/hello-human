package com.selenanguyen.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
//	 http://127.0.0.1:8080/
//	 http://127.0.0.1:8080/?name=Shineshine
	@GetMapping("/")
	public String hello(@RequestParam(value="name", required =false, defaultValue="Human") String searchQuery) {
		return "Hello " + searchQuery;
	}
	
//	@GetMapping("/")
//	public String hello() {
//		return "Hello Human";
//	}
//	
//	@GetMapping("/name")
//	public String hello(@RequestParam(value="name", required =false) String searchQuery) {
//		return "Hello " + searchQuery;
//	}
	

}
