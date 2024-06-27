package com.example.Full_todo_api.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Todo {
	Integer id;
	String title;
	String text;
	String status;
	LocalDateTime startDate;
	LocalDateTime dueDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime updatedAt;
}