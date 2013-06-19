package com.sirma.itt.javacourse.patterns.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The invoker class for the calculator command pattern. Creates a history of
 * the used commands.
 */
public class CalculatorUser {

	private final List<Command> executedCommands = new ArrayList<Command>();
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
	 * A getter method for the commands history.
	 * 
	 * @return the list with all commands executed so far.
	 */
	public List<Command> getExecutedCommands() {
		return executedCommands;
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
		Command cmd = null;
		switch (operator) {
			case '+':
				cmd = new CommandAdd(operand, calculator);
				break;
			case '-':
				cmd = new CommandSubstract(operand, calculator);
				break;
			case '*':
				cmd = new CommandMultiply(operand, calculator);
				break;
			case '/':
				cmd = new CommandDivide(operand, calculator);
				break;
			case '^':
				cmd = new CommandPower((int) operand, calculator);
				break;
			default:
				throw new IllegalArgumentException("Operation " + operator
						+ " is invalid.");
		}
		cmd.execute();
		executedCommands.add(cmd);
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
