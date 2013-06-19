package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Maintains a statistics for the available goods in the shop.
 */
public class ProductsLister extends Observable {

	private final List<Product> availableProducts;
	
	/**
	 * A nullary constrcutor.
	 */
	public ProductsLister() {
		this.availableProducts = new ArrayList<Product>();
	}

	/**
	 * Adds a new product to the list and notifies all observers for that.
	 * 
	 * @param product
	 *            is the new product to add.
	 */
	public void add(Product product) {
		availableProducts.add(product);
		notifyObservers(availableProducts);
	}
}
