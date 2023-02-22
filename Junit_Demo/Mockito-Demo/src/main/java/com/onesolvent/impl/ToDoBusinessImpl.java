package com.onesolvent.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.onesolvent.api.TodoService;

public class ToDoBusinessImpl {
	
	private TodoService todoService;

	public ToDoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	
	public List<String>  retrieveTodos(String user){
		
		  List<String> retrievedtodos = new ArrayList<String>();  
	        List<String> todos = todoService.getTodo(user);  
	          
	        for(String todo :todos) {  
	            if(todo.contains("Spring")) {  
	                retrievedtodos.add(todo);  
	            }  
	        }  
	        return retrievedtodos;  
	        }  
	}


