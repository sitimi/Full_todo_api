package com.example.Full_todo_api.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Todo {
	Integer id;
	String title;
	String text;
	String status;
	Date dueDate;
	Date createdAt;
	Date updatedAt;
}
