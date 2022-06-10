package com.selenanguyen.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
//	 http://127.0.0.1:8080/
//	 http://127.0.0.1:8080/?name=Shineshine
	@GetMapping("/")
	public String hello(@RequestParam(value="first_name", required =false, defaultValue="Human") String searchFirst, 
			@RequestParam(value="last_name", required =false) String searchLast, 
			@RequestParam(value="count", required =false) Integer counting) {
		String first = "";
		String last = "";
		for(int i=0; i<counting; i++) {
			first += searchFirst;
			last += searchLast;
		}
		return "You searched for " + first + " " + last + " for " + counting + "times";
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
