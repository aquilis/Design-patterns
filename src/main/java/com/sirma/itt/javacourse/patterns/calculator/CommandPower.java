package com.sirma.itt.javacourse.patterns.calculator;

/**
 * Encapsulates a command that evaluates x by the power specified as y.
 */
public class CommandPower implements Command {

	@Override
	public float execute(float x, float y) {
		return (float) Math.pow(x, y);
	}
}
