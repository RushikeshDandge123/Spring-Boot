package com.rushikeshit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/wecome")
	public ResponseEntity<String> getMsg(){
		return new ResponseEntity<String>("Welcome to Spring Boot Rest API.....", HttpStatus.OK);
	}
}
