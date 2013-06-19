package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores the products that have been sold out and are not available already.
 */
public class SoldProductsLister implements Observable {
	private List<Product> soldProducts;
	private List<Observer> observers;

	/**
	 * A nullary constrcutor.
	 */
	public SoldProductsLister() {
		this.soldProducts = new ArrayList<Product>();
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
			obs.notify(this, soldProducts);
		}
	}

	/**
	 * Adds a new product to the list and notifies all observers for that.
	 * 
	 * @param product
	 *            is the new product to add.
	 */
	public void add(Product product) {
		soldProducts.add(product);
		notifyAllObservers();
	}
}
