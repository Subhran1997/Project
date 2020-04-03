package com.mavenproject;

import org.junit.Assert;

//import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

import org.junit.Test;

import com.mavenprojects.FIzzBuzz;

public class FizzBuzzTest {
@Test
public void testNumber() {
	String fizzBuzz=new FIzzBuzz().play(1);
	Assert.assertEquals(fizzBuzz, "1");
}
@Test
public void testNumber1() {
	String fizzBuzz=new FIzzBuzz().play(3);
	Assert.assertEquals(fizzBuzz, "Fizz");
}
}

