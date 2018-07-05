package com.hello;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		StringCalculator.add("1,2");
	}
	
	@Test(expected = RuntimeException.class)
	public void testIsNumberMoreThanTwo(){
		StringCalculator.add("1,4,6");
	}
	
}