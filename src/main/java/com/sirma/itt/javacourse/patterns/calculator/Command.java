package com.sirma.itt.javacourse.patterns.calculator;

/**
 * The base command interface realizing the command pattern.
 */
public interface Command {
	/**
	 * the base execute command taking two parameters and returning the result
	 * from the calculation.
	 * 
	 * @param x
	 *            is the first operand for the calculation
	 * @param y
	 *            is the second operand for the calculation
	 * @return the result from the calculation
	 */
	float execute(float x, float y);
}
