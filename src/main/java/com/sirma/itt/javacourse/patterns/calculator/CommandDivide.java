package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a command that divides the calculator's current value by the
 * operand.
 */
public class CommandDivide implements Command {
	private final float operand;
	private final Calculator calculator;

	/**
	 * Constructs the command.
	 * 
	 * @param operand
	 *            is the number to add
	 * @param calculator
	 *            is the calculator to command
	 */
	public CommandDivide(float operand, Calculator calculator) {
		this.operand = operand;
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.divide(operand);
	}
}
