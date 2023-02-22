package com.onesolvent.impl;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.Matchers.*; 

public class HarmcrestDemo {
	
	 @Test
	    public void given2Strings_whenEqual_thenCorrect() {
	        String a = "foo";
	        String b = "FOO";
	        MatcherAssert.assertThat(a, equalToIgnoringCase(b));
	    }
	 
	
	 
	 @Test
	 public void givenInteger_whenAPositiveValue_thenCorrect() {
	     int num = 1;
	     assertThat(num, isAPositiveInteger());
	 }

}
