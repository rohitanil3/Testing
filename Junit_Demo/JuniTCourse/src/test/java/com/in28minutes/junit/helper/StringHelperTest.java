package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	
	static StringHelper helper;
	
	@BeforeClass
	public static void intiate(){
		System.out.println("initiate");
		 helper=new StringHelper();
		 
	}
	
	@Before
	public void setup(){
		System.out.println("before");
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		assertEquals("ABC", "ABC");
		//assertEquals("ABC", "ABCD");
	}
	
	@AfterClass
	public static void last(){
		System.out.println("After class");
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		
		assertEquals("ABC", "ABCD");
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testIfStringareSame(){
		
		StringHelper helper=new StringHelper();
		boolean actualflag = helper.areFirstAndLastTwoCharactersTheSame("AABAA");
		boolean expectedFlag=true;
		 assertEquals(expectedFlag,actualflag);
	}
	
	@Test
	public void testFalse(){
		
          assertFalse(2!=2);

	}
	
	
	@Test
	public void testArray(){
		
          int arr[]={1,2,3,4,5};
          int arr2[]={4,1,3,2};
          
          
          Arrays.sort(arr2);
          
          assertArrayEquals(arr, arr2);

	}

}
