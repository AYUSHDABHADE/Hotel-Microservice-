package com.hotel.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("removal")
@RestController
@RequestMapping("/staff")
public class StaffController {
   @GetMapping
	public ResponseEntity<List<String>> getStaff() {

		
			List <String> list =Arrays.asList("Ram,Shyam,Geeta,Seeta");	
			
			return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
