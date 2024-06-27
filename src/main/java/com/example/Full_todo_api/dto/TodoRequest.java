package com.example.Full_todo_api.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TodoRequest {
	String title;
	String text;
	String status;
	LocalDateTime dueDate;
}
