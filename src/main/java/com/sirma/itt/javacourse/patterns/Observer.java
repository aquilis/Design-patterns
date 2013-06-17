package com.sirma.itt.javacourse.patterns;

/**
 * The observer classes that are notified for changes in the observable classes
 * implement this interface.
 */
public interface Observer {

	/**
	 * Notifies the observer passing as parameters a refernce to the observable
	 * object and one or more variable parameters. Suitable when the observer
	 * has more than one observables and has to determine which one triggered
	 * the notify method.
	 * 
	 * @param observable
	 *            is the observable object taht has triggered the method
	 * @param objs
	 *            are the objects that has changed in the observable
	 */
	void notify(Observable observable, Object... objs);

}
