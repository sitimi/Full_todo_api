package com.example.Full_todo_api.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Todo {
	Integer id;
	String title;
	String text;
	String status;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime dueDate;
//	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime createdAt;
//	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime updatedAt;
}