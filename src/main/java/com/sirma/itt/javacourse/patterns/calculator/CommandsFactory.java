package com.sirma.itt.javacourse.patterns.calculator;

/**
 * A factory class creating all types of mathematical commands according to the
 * command operation parameter. Modifiy its factory method in order to add
 * functionality to the calculator.
 */
public class CommandsFactory {
	/**
	 * Enumeration with all available command that the calculator can execute.
	 * Easy way for adding more, without modifying the calculator's code
	 */
	public static enum commandOption {
		ADD, SUBSTRACT, MULTIPLY, DIVIDE, POWER
	};
	
	/**
	 * A factory method returning all types of concrete commands acording to the
	 * command option sepcified.
	 * 
	 * @param cmdOption
	 *            is the mathematical operation to be performed
	 * @return the desired mathematical command according to the input parameter
	 */
	public Command getCommand(commandOption cmdOption) {
		switch (cmdOption) {
			case ADD:
				return new CommandAdd();
			case SUBSTRACT:
				return new CommandSubstract();
			case MULTIPLY:
				return new CommandMultiply();
			case DIVIDE:
				return new CommandDivide();
			case POWER:
				return new CommandPower();
			default:
				throw new IllegalArgumentException("Illegal command option.");
		}
	}
}
