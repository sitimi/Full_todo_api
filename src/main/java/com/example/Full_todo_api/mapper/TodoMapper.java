package com.example.Full_todo_api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.Full_todo_api.entity.Todo;

@Mapper
public interface TodoMapper {
	List<Todo> findAll();
}
