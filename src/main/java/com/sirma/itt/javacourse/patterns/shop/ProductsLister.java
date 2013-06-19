package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains a statistics for the available goods in the shop.
 */
public class ProductsLister implements Observable {

	private List<Product> availableProducts;
	private List<Observer> observers;
	
	/**
	 * A nullary constrcutor.
	 */
	public ProductsLister() {
		this.availableProducts = new ArrayList<Product>();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer obs : observers) {
			obs.notify(this, availableProducts);
		}
	}

	/**
	 * Adds a new product to the list and notifies all observers for that.
	 * 
	 * @param product
	 *            is the new product to add.
	 */
	public void add(Product product) {
		availableProducts.add(product);
		notifyAllObservers();
	}
}
