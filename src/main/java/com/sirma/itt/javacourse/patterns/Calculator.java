package com.sirma.itt.javacourse.patterns;


/**
 * The reciever class that has to be commanded.
 */
public class Calculator {
	private float current = 0;



	/**
	 * Calculates the operator and the operand and updates the current value.
	 * 
	 * @param operand
	 *            is the number to operate with
	 * @param operator
	 *            is the operator character
	 */
	public void calculate(float operand, char operator) {
		float oldCurrent = current;
		switch (operator) {
			case '+':
				current += operand;
				break;
			case '-':
				current -= operand;
				break;
			case '*':
				current *= operand;
				break;
			case '/':
				current /= operand;
				break;
			case '^':
				current = (float) Math.pow(current, operand);
				break;
			default:
				break;
		}
		System.out.println(oldCurrent + " " + operator + " " + operand + " = "
				+ current);
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
