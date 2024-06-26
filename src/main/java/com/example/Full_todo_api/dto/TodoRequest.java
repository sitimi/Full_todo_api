package com.example.Full_todo_api.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class TodoRequest {
	String title;
	String text;
	String status;
	Date dueDate;
}
