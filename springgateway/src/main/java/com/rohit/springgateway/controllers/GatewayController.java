package com.rohit.springgateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

	@GetMapping(path = "/test")
	public ResponseEntity<String> getTest() {
		return new ResponseEntity<>("Gateway test", HttpStatus.OK);
	}
	
}
