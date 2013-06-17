package com.sirma.itt.javacourse.patterns;

/**
 * Concrete factory2.
 */
public class AudiFactory extends CarFactory {

	@Override
	public Audi createInstance() {
		return new Audi();
	}

}
