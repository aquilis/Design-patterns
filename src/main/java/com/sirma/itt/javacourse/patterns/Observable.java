package com.sirma.itt.javacourse.patterns;

/**
 * Interface implemented by all classes that will be observable by other classes
 * and have to notify them for changes.
 */
public interface Observable {
	/**
	 * Adds a new observer to the list of observer objects.
	 * 
	 * @param o
	 *            is the new observer to add.
	 */
	void addObserver(Observer o);

	/**
	 * Removes the observer from the list.
	 * 
	 * @param o
	 *            is the observer object to remove
	 */
	void removeObserver(Observer o);

	/**
	 * Notifies all observer objects for changes.
	 */
	void notifyAllObservers();
}
