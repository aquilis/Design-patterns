package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a multiplication command.
 */
public class CommandMultiply implements Command {

	@Override
	public float execute(float x, float y) {
		return x * y;
	}
}
