package com.revature.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cars")
public class CarController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		String hello = "hello world";
		return ResponseEntity.ok(hello);
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<String> returnName(@PathVariable("name") String n) {
		return ResponseEntity.ok(n);
	}
	
	@GetMapping("/Honda")
	@ResponseBody
	public String honda() {
		return "honda";
	}
	
	@GetMapping("/index")
	public String getIndex() {
		return "/pages/index.html";
	}
	
	@GetMapping("/hidden")
	public String goSecret( ) {
		return "secret";
	}
	
}
