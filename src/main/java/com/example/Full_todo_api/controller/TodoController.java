package com.example.Full_todo_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/todos")
public class TodoController {

	@GetMapping
	public String hello() {
		return "Hello world";
	}
	
}
