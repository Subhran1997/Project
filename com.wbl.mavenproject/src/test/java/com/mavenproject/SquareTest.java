package com.mavenproject;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.mavenprojects.Square;



public class SquareTest {
	@Test
	public void test() {
		Square test=new Square(); 
		int output=test.square(5);
		
		assertEquals(25, output);
	}
	}


