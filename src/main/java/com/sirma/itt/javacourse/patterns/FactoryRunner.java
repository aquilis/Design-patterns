package com.sirma.itt.javacourse.patterns;


/**
 * A runner class for the abstarct factory pattern.
 */
public final class FactoryRunner {
	/**
	 * private constrcutor.
	 */
	private FactoryRunner() {
	}
	
	/**
	 * entry point for the class.
	 * 
	 * @param args
	 *            are the cmd args
	 * @throws IllegalAccessException
	 *             asdasd
	 * @throws InstantiationException
	 *             asd aa
	 * @throws ClassNotFoundException
	 *             asdasd
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// CarFactory factory = new BmwFactory();
		// Client client = new Client();
		// client.createCar(factory);
		Car myCar = CarFactory.createInstance(Bmw.class.getCanonicalName());
		myCar.printData();
	}
}
