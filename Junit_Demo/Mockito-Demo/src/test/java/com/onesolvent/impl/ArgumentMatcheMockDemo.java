package com.onesolvent.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;   // ...or...

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*; 

import org.junit.Test;
public class ArgumentMatcheMockDemo {
	
	@Test
	public void testAnyInt(){
		List mock = mock(List.class);
		when(mock.get(anyInt())).thenReturn("Rohit");
		
		assertEquals("Rohit", mock.get(3));
		assertEquals("Rohit", mock.get(2));
		//assertEquals("rohit", mock.get(3));
	}
	
	@Test(expected=RuntimeException.class)
	public void testThrowException(){
		List mock = mock(List.class);
		when(mock.get(anyInt())).thenThrow(new RuntimeException("Error"));
		

       mock.get(0);
	}


}
