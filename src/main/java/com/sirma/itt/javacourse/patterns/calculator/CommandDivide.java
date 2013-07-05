package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a division command.
 */
public class CommandDivide implements Command {
	@Override
	public float execute(float x, float y) {
		return x / y;
	}
}
