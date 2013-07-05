package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a substraction command.
 */
public class CommandSubstract implements Command {
	@Override
	public float execute(float x, float y) {
		return x - y;
	}
}