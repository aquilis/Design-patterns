package com.sirma.itt.javacourse.patterns.abstractFactory;


/**
 * Concrete factory2.
 */
public class AudiFactory extends CarFactory {

	@Override
	public Audi createInstance() {
		return new Audi();
	}

}
