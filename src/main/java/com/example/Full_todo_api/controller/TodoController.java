package com.example.Full_todo_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Full_todo_api.dto.TodoResponse;
import com.example.Full_todo_api.entity.Todo;
import com.example.Full_todo_api.mapper.TodoMapper;


@RestController
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	TodoMapper todoMapper;

	@GetMapping
	public List<TodoResponse> getTodos() {
		List<Todo> todoList = todoMapper.findAll();
		List<TodoResponse> todoResponseList = new ArrayList<>();
		
		todoList.forEach(todo -> {
			TodoResponse todoResponse = new TodoResponse();
			BeanUtils.copyProperties(todo, todoResponse);
			todoResponseList.add(todoResponse);
		});
		return todoResponseList;
	}
	
}
