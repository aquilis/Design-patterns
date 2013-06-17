package com.sirma.itt.javacourse.patterns;

/**
 * The concrete calculation command for the calculator.
 */
public class CalculateCommand implements Command {
	private char operator;
	private float operand;
	private Calculator calculator;

	/**
	 * Construct the concrete command with an operator and operand.
	 * 
	 * @param operator
	 *            is the
	 * @param operand
	 *            is the operand value to work with
	 * @param calculator
	 *            is the calculator instance where the command will be recieved
	 *            and excuted
	 */
	public CalculateCommand(Calculator calculator, char operator, float operand) {
		this.calculator = calculator;
		this.operand = operand;
		this.operator = operator;
	}

	@Override
	public void execute() {
		calculator.calculate(operand, operator);
	}
}
