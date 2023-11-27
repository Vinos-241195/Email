package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Mailservice;
@RestController
public class Mailcontroller {
@Autowired
	private Mailservice em;
	
	@GetMapping("/sendmail")
	public String sendmail() {
		em.sendmail("divyashreesenthilkumar@gmail.com","Welcome","This is a Sample mail");
		return "Email sent";
		
	}
	
}
