package com.sirma.itt.javacourse.patterns.calculator;


/**
 * A portable calculator class commanded entirely by the concerete command
 * classes.
 */
public class Calculator {

	private float current = 0;
	
	/**
	 * Performs the mathematical operation to the current value according to the
	 * commandOption specified. For more details, see CommandFactory
	 * implementation.
	 * 
	 * @param commandOption
	 *            is the mathematical operation to be performed to the
	 *            calculator's current value and the operand specified
	 * @param operand
	 *            is the second operand for the command. The first one is the
	 *            calculator,s current value.
	 */
	public void calculate(CommandsFactory.commandOption commandOption,
			float operand) {
		Command tempCommand = new CommandsFactory().getCommand(commandOption);
		current = tempCommand.execute(current, operand);
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
