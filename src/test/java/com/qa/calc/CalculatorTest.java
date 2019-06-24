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

}
