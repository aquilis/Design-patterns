package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * The final client that observes the available and sold products.
 */
public class FinalClientProducts implements Observer {
	private List<Product> available;
	private List<Product> sold;

	/**
	 * default constructor.
	 */
	public FinalClientProducts() {
		this.available = new ArrayList<Product>();
		this.sold = new ArrayList<Product>();
	}

	/**
	 * A getter for the available products list.
	 * 
	 * @return the list of available products.
	 */
	public List<Product> getAvailable() {
		return available;
	}

	/**
	 * A getter or the sold products list.
	 * 
	 * @return the list of sold products
	 */
	public List<Product> getSold() {
		return sold;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notify(Observable observable, Object... objs) {
		this.available = (List<Product>) objs[0];
		this.sold = (List<Product>) objs[1];
	}
}
