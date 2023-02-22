package com.onesolvent.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.onesolvent.api.TodoService;
import com.onesolvent.api.TodoServiceStub;

public class ToDoBusinessImplStub {

	@Test
	public void test() {

		TodoService todoService=new TodoServiceStub();
		ToDoBusinessImpl businessImpl=new ToDoBusinessImpl(todoService);
		List<String> retrieveTodos = businessImpl.retrieveTodos("suresh");
		assertEquals(1, retrieveTodos.size());
	}

}
