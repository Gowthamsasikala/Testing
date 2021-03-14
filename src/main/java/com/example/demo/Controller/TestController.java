package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")
@CrossOrigin("*")
public class TestController {

	
	@GetMapping("/check")
	public ResponseEntity<?> checking(){	
		return new ResponseEntity<String>("Its working maan..!",HttpStatus.OK);
	}
}
