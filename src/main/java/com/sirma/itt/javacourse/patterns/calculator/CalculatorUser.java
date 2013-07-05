package com.sirma.itt.javacourse.patterns.calculator;

import java.util.Scanner;

/**
 * The invoker class for the calculator command pattern.
 */
public class CalculatorUser {

	private final Calculator calculator = new Calculator();
	private final Scanner scn = new Scanner(System.in);

	/**
	 * Opens a custom command line to use the calculator as a console
	 * application.
	 */
	public void openConsole() {
		System.out.println(calculator.getCurrent());
		do {
			System.out.println("Enter operator (+ - * / ^): ");
			char tempOperator = scn.nextLine().charAt(0);
			System.out.println("Enter operand: ");
			float tempOperand = scn.nextFloat();
			float oldCurrent = calculator.getCurrent();
			compute(tempOperator, tempOperand);
			scn.nextLine();
			System.out.println(oldCurrent + " " + tempOperator + " "
					+ tempOperand + " = " + calculator.getCurrent());
		} while (true);
	}

	/**
	 * A nullarty constrcutor.
	 */
	public CalculatorUser() {
	}

	/**
	 * Invokes a command with the given parameters.
	 * 
	 * @param operator
	 *            is the operator character for the command.
	 * @param operand
	 *            is the operand value top work with
	 * @return the result from the calculation
	 */
	public float compute(char operator, float operand) {
		switch (operator) {
			case '+':
				calculator
						.calculate(CommandsFactory.commandOption.ADD, operand);
				break;
			case '-':
				calculator.calculate(CommandsFactory.commandOption.SUBSTRACT,
						operand);
				break;
			case '*':
				calculator.calculate(CommandsFactory.commandOption.MULTIPLY,
						operand);
				break;
			case '/':
				calculator.calculate(CommandsFactory.commandOption.DIVIDE,
						operand);
				break;
			case '^':
				calculator.calculate(CommandsFactory.commandOption.POWER,
						operand);
				break;
			default:
				throw new IllegalArgumentException("Operation " + operator
						+ " is invalid.");
		}
		return calculator.getCurrent();
	}

	/**
	 * self-test.
	 * 
	 * @param args
	 *            are the cmd args
	 */
	public static void main(String[] args) {
		CalculatorUser user = new CalculatorUser();
		user.openConsole();
	}
}
