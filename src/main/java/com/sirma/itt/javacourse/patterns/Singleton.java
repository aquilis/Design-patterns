package com.sirma.itt.javacourse.patterns;


/**
 * Implementation of the singlelton design pattern.
 */
public final class Singleton {
	private static Singleton instance = null;

	/**
	 * Singleton class is not instantiated from outside.
	 */
	private Singleton() {
	}

	/**
	 * Get the unique instance of the singleton class.
	 * 
	 * @return an instance of the singleton class
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
