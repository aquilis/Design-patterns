package com.sirma.itt.javacourse.patterns;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This object pool is designd to store a certain number of reusable car
 * instances that can be acquired and released to the pool. Thus, it accepts a
 * car factory instance as an argument and uses the abstract factory pattern.
 * 
 * @author vtsonev
 */
@SuppressWarnings("unused")
public final class ObjectPool {

	private final CarFactory factory;
	private final Queue<Car> freeCars;
	private final int maxCars;

	/**
	 * Constructs the pool with an initial car factory that will create the
	 * reusable objects and a max capacity.
	 * 
	 * @param factory
	 *            is a concrete car factory that will store the cars
	 * @param maxCapacity
	 *            is the max capacity of the pool
	 */
	public ObjectPool(CarFactory factory, int maxCapacity) {
		this.factory = factory;
		this.maxCars = maxCapacity;
		this.freeCars = new LinkedList<Car>();
		/*
		 * Fill the pool with car instances until the maxCapacity is reached.
		 */
		for (int i = 0; i < maxCapacity; i++) {
			freeCars.offer(factory.createInstance());
		}
	}

	/**
	 * Acquires a free reusable resource (car), if any.
	 * 
	 * @return an insatnce of the reusable resource - a car
	 * @throws EmptyPoolException
	 *             if there are no free cars in the object pool
	 */
	public synchronized Car acquire() throws EmptyPoolException {
		if (freeCars.size() == 0) {
			throw new EmptyPoolException(
					"There are no free cars remaining in the pool");
		} else {
			return freeCars.poll();
		}
	}

	/**
	 * Releases the given car insance, returning in back to the pool.
	 * 
	 * @param car
	 *            is the car insance to release.
	 * @throws FullPoolException
	 *             if the pool is already filled and new cars can't be released.
	 */
	public synchronized void release(Car car) throws FullPoolException {
		if (freeCars.size() < maxCars) {
			freeCars.offer(car);
		} else {
			throw new FullPoolException(
					"Max size of the object pool reached. Can't release more.");
		}
	}
}
