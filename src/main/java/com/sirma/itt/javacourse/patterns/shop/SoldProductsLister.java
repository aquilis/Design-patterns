package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Stores the products that have been sold out and are not available already.
 */
public class SoldProductsLister extends Observable {
	private final List<Product> soldProducts;

	/**
	 * A nullary constrcutor.
	 */
	public SoldProductsLister() {
		this.soldProducts = new ArrayList<Product>();
	}

	/**
	 * Adds a new product to the list and notifies all observers for that.
	 * 
	 * @param product
	 *            is the new product to add.
	 */
	public void add(Product product) {
		soldProducts.add(product);
		notifyObservers(soldProducts);
	}
}
