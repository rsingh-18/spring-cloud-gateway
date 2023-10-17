package com.rohit.springapp1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(path = "/test")
	public ResponseEntity<String> getTest() {
		return new ResponseEntity<>("App test", HttpStatus.OK);
	}

}
