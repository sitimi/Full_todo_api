package com.example.Full_todo_api.dto;
import java.sql.Date;

import lombok.Data;

@Data
public class TodoResponse {
	Integer id;
	String title;
	String text;
	String status;
	Date dueDate;
	Date createdAt;
	Date updatedAt;
}
