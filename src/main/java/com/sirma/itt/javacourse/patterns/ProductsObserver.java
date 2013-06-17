package com.sirma.itt.javacourse.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Observes all changes in the available and sold products and notifies the
 * other "subscribed" classes for that. Thus, the products observer implements
 * both Observable and Observer interfaces.
 */
@SuppressWarnings("unchecked")
public class ProductsObserver implements Observable, Observer {
	private List<Observer> observers;
	private List<Product> availableProducts;
	private List<Product> soldProducts;

	/**
	 * A nullary constrcutor.
	 */
	public ProductsObserver() {
		this.observers = new ArrayList<Observer>();
	}


	@Override
	public void notify(Observable observable, Object... objs) {
		if (observable.getClass() == ProductsLister.class) {
			this.availableProducts = (List<Product>) objs[0];
			notifyAllObservers();
		} else if (observable.getClass() == SoldProductsLister.class) {
			this.soldProducts = (List<Product>) objs[0];
			notifyAllObservers();
		}
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	/**
	 * When notifying the observers, this class pass them an array of two lists,
	 * where the first one is the available products and the second one is the
	 * sold products. The observer classes know this layout and use it their own
	 * way.{@inheritDoc}
	 */
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.notify(this, availableProducts, soldProducts);
		}
	}
}
