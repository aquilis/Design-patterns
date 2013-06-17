package com.sirma.itt.javacourse.patterns;

/**
 * The client class that uses the functionality of the abstract factory.
 */
public class Client {
	/**
	 * Creates a car according to what factory is passes as a parameter.
	 * 
	 * @param factory
	 *            is a concrete instance of a car factory that will create cars.
	 */
	public void createCar(CarFactory factory) {
		Car car = factory.createInstance();
		car.printData();
	}
}
