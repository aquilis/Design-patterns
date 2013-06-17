package com.sirma.itt.javacourse.patterns;

/**
 * A product class used for the Observer pattern. Implements a simple logic for
 * easier testing.
 */
public class Product implements Comparable<Product> {

	private String name;

	/**
	 * Constrcuts the product with a name.
	 * 
	 * @param name
	 *            is the new name
	 */
	public Product(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.name);
	}
}
