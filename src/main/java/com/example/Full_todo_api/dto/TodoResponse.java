package com.example.Full_todo_api.dto;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoResponse {
	Integer id;
	String title;
	String text;
	String status;

	LocalDateTime dueDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime updatedAt;
}
