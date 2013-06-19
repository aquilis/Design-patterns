package com.sirma.itt.javacourse.patterns.calculator;


/**
 * The reciever class that has to be commanded.
 */
public class Calculator {
	private float current = 0;

	/**
	 * Adds the opearand to the current result.
	 * 
	 * @param operand
	 *            is the number to add
	 */
	public void add(float operand) {
		current += operand;
	}

	/**
	 * Substracts the operand from the current value.
	 * 
	 * @param operand
	 *            is the number to subastarct
	 */
	public void substract(float operand) {
		current -= operand;
	}
	
	/**
	 * Multiplies the current value by the operand.
	 * 
	 * @param operand
	 *            is the number to multiply by
	 */
	public void multiply(float operand) {
		current *= operand;
	}

	/**
	 * Divides the current value by the operand value.
	 * 
	 * @param operand
	 *            is the number to divide by
	 */
	public void divide(float operand) {
		current /= operand;
	}

	/**
	 * Multiplies the current value by itself the given number of times.
	 * 
	 * @param operand
	 *            is the power to evalueate of
	 */
	public void power(int operand) {
		current = (float) Math.pow(current, operand);
	}

	/**
	 * Returns the current value of the claculator.
	 * 
	 * @return the current value of the claculator
	 */
	public float getCurrent() {
		return current;
	}
}
