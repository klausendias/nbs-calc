package com.qa.calc;

import org.junit.Test;

import org.junit.Assert;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator ();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void SubtractTwoNumbersTest() {
		Calculator calculator = new Calculator ();
		int result = calculator.subtract(3,2);
		Assert.assertEquals(1, result);

	}
	
	@Test
	public void MuliplyTwoNumbersTest() {
		Calculator calculator = new Calculator ();
		int result = calculator.multiply(3,2);
		Assert.assertEquals(6, result);
    
	@Test
	public void DivideTwoNumbersTest() {
		Calculator calculator = new Calculator ();
		int result = calculator.divide(4,2);
		Assert.assertEquals(2, result);
	}


}
