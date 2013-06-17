package com.sirma.itt.javacourse.patterns;

/**
 * Concrete factory1.
 */
public class BmwFactory extends CarFactory {

	@Override
	public Bmw createInstance() {
		return new Bmw();
	}
}
