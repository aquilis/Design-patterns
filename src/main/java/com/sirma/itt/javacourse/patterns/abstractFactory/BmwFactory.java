package com.sirma.itt.javacourse.patterns.abstractFactory;


/**
 * Concrete factory1.
 */
public class BmwFactory extends CarFactory {

	@Override
	public Bmw createInstance() {
		return new Bmw();
	}
}
