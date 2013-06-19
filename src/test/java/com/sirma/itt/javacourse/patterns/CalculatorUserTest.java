package com.sirma.itt.javacourse.patterns;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sirma.itt.javacourse.patterns.calculator.CalculatorUser;

/**
 * Test the command design pattern.
 */
public class CalculatorUserTest {

	/**
	 * Test the arithmetic operations of the calculator.
	 */
	@Test
	public void test() {
		CalculatorUser user = new CalculatorUser();
		/*
		 * The initial value of the calculator is 0
		 */
		assertTrue(user.compute('+', 100) == 100);
		assertTrue(user.compute('-', 50) == 50);
		assertTrue(user.compute('*', 2) == 100);
		assertTrue(user.compute('/', 5) == 20);
		assertTrue(user.compute('^', 2) == 400);
	}
}
