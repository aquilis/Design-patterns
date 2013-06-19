package com.sirma.itt.javacourse.patterns.proxy;

/**
 * The client that deals with the intgere proxy.
 */
public class IntegerFactory {
	/**
	 * Create the proxy of the integer class.
	 * 
	 * @return the proxy of the real integer class
	 */
	public IInteger createInstance() {
		return new IntegerProxy();
	}
}
