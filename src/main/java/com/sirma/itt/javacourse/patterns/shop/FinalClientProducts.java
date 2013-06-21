package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

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

	/**
	 * The update method accepts a list of two arraylists where the first one is
	 * for the available and the second one is for the sold products.
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void update(Observable o, Object arg) {
		List<List<Product>> listArg = (List<List<Product>>) arg;
		this.available = listArg.get(0);
		this.sold = listArg.get(1);
	}
}
