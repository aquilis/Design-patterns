package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a command that evaluates the calculator's current value by the
 * power specified as an operand.
 */
public class CommandPower implements Command {
	private final int operand;
	private final Calculator calculator;

	/**
	 * Constructs the command.
	 * 
	 * @param operand
	 *            is the number to add
	 * @param calculator
	 *            is the calculator to command
	 */
	public CommandPower(int operand, Calculator calculator) {
		this.operand = operand;
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		calculator.power(operand);
	}
}
