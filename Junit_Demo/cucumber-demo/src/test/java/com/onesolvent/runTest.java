package com.onesolvent;



import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 
@RunWith(Cucumber.class) 
@Cucumber.Options(
          glue="definitions",
		format = {"pretty", "html:target/cucumber"}) 

public class runTest { }