package com.nissan.pace.poc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {
	
    private static final Logger logger = LoggerFactory.getLogger(BankAccountController.class);


    @GetMapping(value="/hello")
	public ResponseEntity<String> getAllEmployees() {
        return new ResponseEntity<>("Hi From Controller", HttpStatus.OK);
	}

   
}
