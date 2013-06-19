package com.sirma.itt.javacourse.patterns.abstractFactory;


/**
 * The abstract factory.
 */
public abstract class CarFactory {
	/**
	 * Creates an instance of a specific car implemented by the child classes.
	 * 
	 * @return an instance of Car
	 */
	abstract Car createInstance();

	/**
	 * A method that uses reflection to instantiate a concrete instance of the
	 * abstract product Car.
	 * 
	 * @param className
	 *            is the canonical bname of the concrete product to be created
	 *            by the factory method.
	 * @return an instance of the concrete product.
	 * @throws ClassNotFoundException
	 *             if the class specified does not exist
	 * @throws IllegalAccessException
	 *             if the access is denied
	 * @throws InstantiationException
	 *             if the class can not be instantiated
	 */
	public static Car createInstance(String className)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Class<?> productClass = Class.forName(className);
		return (Car) productClass.newInstance();
	}
}
