package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates an addition command.
 */
public class CommandAdd implements Command {

	@Override
	public float execute(float x, float y) {
		return x + y;
	}
}
