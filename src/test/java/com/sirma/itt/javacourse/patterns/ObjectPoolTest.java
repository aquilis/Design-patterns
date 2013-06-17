package com.sirma.itt.javacourse.patterns;

import org.junit.Test;

/**
 * Test the Object pool.
 * 
 * @author vtsonev
 */
public class ObjectPoolTest {
	/**
	 * Test the behavior of the acquire method with an empty object pool.
	 * 
	 * @throws EmptyPoolException
	 *             if the pool is empty
	 */
	@Test(expected = EmptyPoolException.class)
	public void testEmptyPoolError() throws EmptyPoolException {
		ObjectPool test = new ObjectPool(new BmwFactory(), 2);
		test.acquire();
		test.acquire();
		test.acquire();
	}

	/**
	 * Test the behavior of the release method with a full object pool. We can't
	 * release instances to the pool, if we haven't acquired any.
	 * 
	 * @throws FullPoolException
	 *             if the pool is full
	 */
	@Test(expected = FullPoolException.class)
	public void testFullPoolError() throws FullPoolException {
		ObjectPool test = new ObjectPool(new BmwFactory(), 10);
		test.release(new Bmw());
	}
}
