package com.sirma.itt.javacourse.patterns;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sirma.itt.javacourse.patterns.shop.FinalClientProducts;
import com.sirma.itt.javacourse.patterns.shop.Product;
import com.sirma.itt.javacourse.patterns.shop.ProductsLister;
import com.sirma.itt.javacourse.patterns.shop.ProductsObserver;
import com.sirma.itt.javacourse.patterns.shop.SoldProductsLister;

/**
 * Tests the logic of the observer pattern.
 */
public class FinalClientProductsTest {

	private static String productName1 = "available";
	private static String productName2 = "available2";
	private static String productName3 = "sold";
	private static String productName4 = "sold2";

	private static FinalClientProducts client = new FinalClientProducts();
	private static ProductsObserver observer = new ProductsObserver();
	private static Product p1 = new Product(productName1);
	private static Product p2 = new Product(productName2);
	private static Product p3 = new Product(productName3);
	private static Product p4 = new Product(productName4);
	private static ProductsLister lister = new ProductsLister();
	private static SoldProductsLister sLister = new SoldProductsLister();

	/**
	 * Initialsie the observer hierarchy.
	 */
	@BeforeClass
	public static void init() {
		observer.addObserver(client);
		lister.addObserver(observer);
		sLister.addObserver(observer);
	}

	/**
	 * Test if the final client accepts the changes triggered by the both
	 * product lister classes.
	 */
	@Test
	public void test() {
		lister.add(p1);
		lister.add(p2);
		sLister.add(p3);
		sLister.add(p4);
		assertTrue(client.getAvailable().get(0).compareTo(p1) == 0);
		assertTrue(client.getAvailable().get(1).compareTo(p2) == 0);
		assertTrue(client.getSold().get(0).compareTo(p3) == 0);
		assertTrue(client.getSold().get(1).compareTo(p4) == 0);
	}
}
