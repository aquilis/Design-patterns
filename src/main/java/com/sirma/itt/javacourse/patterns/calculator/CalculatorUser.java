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
	 * Opens a custom command console to input commands to the calculator.
	 */
	public void openConsole() {
		System.out.println(calculator.getCurrent());
		do {
			System.out.println("Enter operator (+ - * / ^): ");
			char tempOperator = scn.nextLine().charAt(0);
			System.out.println("Enter operand: ");
			float tempOperand = scn.nextFloat();
			compute(tempOperator, tempOperand);
			scn.nextLine();
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
		Command cmd = new CalculateCommand(calculator, operator, operand);
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
