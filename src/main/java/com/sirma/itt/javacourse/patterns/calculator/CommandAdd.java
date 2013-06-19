package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a command that adds a certain value to the calculator specified.
 */
public class CommandAdd implements Command {
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
	public CommandAdd(float operand, Calculator calculator) {
		this.operand = operand;
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.add(operand);
	}
}
