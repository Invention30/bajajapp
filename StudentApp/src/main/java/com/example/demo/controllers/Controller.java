package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Data;
import com.example.demo.entities.User;
import com.example.demo.services.Service;


@RestController
public class Controller {
	
	Service uservice = new  Service();
	
	@PostMapping("/bfhl")
	public User getUser(@RequestBody Data data) {
		return uservice.getUser(data.getData());
	}
	
}
