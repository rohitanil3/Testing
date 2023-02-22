package com.onesolvent.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;   // ...or...

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*; 

import org.junit.Test;

import com.onesolvent.api.TodoService;

public class TodoBusinessMock {

	@Test
	public void test() {

	  TodoService todoService = mock(TodoService.class);
	  
		List<String> list = Arrays.asList("Spring","django","hibernate");
		when(todoService.getTodo("suresh")).thenReturn(list);
		ToDoBusinessImpl doBusinessImpl=new ToDoBusinessImpl(todoService);
		List<String> list2 = doBusinessImpl.retrieveTodos("suresh");
		assertEquals(1, list2.size());
	}
	
	@Test
	public void test2() {

	  TodoService todoService = mock(TodoService.class);
	  
		List<String> list = Arrays.asList("Spring","django","hibernate");
		when(todoService.getTodo("suresh")).thenReturn(list);
		ToDoBusinessImpl doBusinessImpl=new ToDoBusinessImpl(todoService);
		List<String> list2 = doBusinessImpl.retrieveTodos("suresh1");
		assertEquals(1, list2.size());
	}

	@Test
	public void TestList(){
		
		List mock = mock(List.class);
		when(mock.get(0)).thenReturn("Mockito");
		assertEquals("Mockito", mock.get(0));
		//assertEquals("Mock", mock.get(0));
	}
	
	@Test
	public void TestList2(){
		
		List mock = mock(List.class);
		when(mock.get(0)).thenReturn("Mockito").thenReturn("EasyMock").thenReturn("PowerMock");
		assertEquals("Mockito", mock.get(0));
		assertEquals("EasyMock", mock.get(0));
		assertEquals("PowerMock", mock.get(0));
		assertEquals("PowerMock", mock.get(0));
		assertEquals("PowerMock", mock.get(0));


	}
}
