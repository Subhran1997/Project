package com.mavenproject;

//public class CountATest {

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.mavenprojects.Square;

public class countATest {
	@Test
	public void test() {
		Square test=new Square();
		int output=test.countA("javabean");
		assertEquals(3, output);
	}

}

