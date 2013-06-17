package com.sirma.itt.javacourse.patterns;

/**
 * The subject interface for the integer class and the integer proxy.
 * 
 */
public interface IInteger {
	/**
	 * Adds the both integers.
	 * 
	 * @param x
	 *            is the other integer to add.
	 * @return the result from the addtion
	 */
	IInteger add(IInteger x);

	/**
	 * Substracts the both integers.
	 * 
	 * @param x
	 *            is the other integer to substract
	 * @return the result from the substraction
	 */
	IInteger substract(IInteger x);
}
