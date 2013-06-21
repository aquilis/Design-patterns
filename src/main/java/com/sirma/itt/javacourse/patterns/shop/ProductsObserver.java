package com.sirma.itt.javacourse.patterns.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Observes all changes in the available and sold products and notifies the
 * other "subscribed" classes for that. Thus, the products observer implements
 * both Observable and Observer interfaces.
 */
public class ProductsObserver extends Observable implements Observer {
	private List<Product> availableProducts = new ArrayList<Product>();
	private List<Product> soldProducts = new ArrayList<Product>();
	private final List<List<Product>> updatedLists = new ArrayList<List<Product>>();

	/**
	 * The default constructor adds the available and sold products lists to the
	 * unified list that wil be passed to the final observers.
	 */
	public ProductsObserver() {
		updatedLists.add(availableProducts);
		updatedLists.add(soldProducts);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void update(Observable o, Object arg) {
		if (o.getClass() == ProductsLister.class) {
			this.availableProducts = (List<Product>) arg;
			updatedLists.set(0, availableProducts);
			setChanged();
			notifyObservers(updatedLists);
		} else if (o.getClass() == SoldProductsLister.class) {
			this.soldProducts = (List<Product>) arg;
			updatedLists.set(1, soldProducts);
			setChanged();
			notifyObservers(updatedLists);
		}
	}
}
