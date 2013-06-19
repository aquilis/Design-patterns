package com.sirma.itt.javacourse.patterns.proxy;

/**
 * The proxy class of the real integer class.
 */
public class IntegerProxy implements IInteger {

	private IntegerClass integer = null;

	@Override
	public IInteger add(IInteger x) {
		if (integer == null) {
			integer = new IntegerClass();
		}
		return integer.add(x);
	}

	@Override
	public IInteger substract(IInteger x) {
		if (integer == null) {
			integer = new IntegerClass();
		}
		return integer.substract(x);
	}
}
