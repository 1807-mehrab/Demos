package com.revature.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Zoo;

@RestController
public class ZooController {
	@PostMapping("/zoo")
	public Zoo createZoo(@Valid @RequestBody Zoo z, Errors errors) {
		Zoo n = null;
		
		if(errors.hasErrors()) {
			return null;
		}
		
		n = z;
		
		return n;
	}
}
