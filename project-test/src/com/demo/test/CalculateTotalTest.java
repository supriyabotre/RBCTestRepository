/**
 * 
 */
package com.demo.test;

import com.demo.main.CalculateTotal;
import com.demo.main.bean.Apple;
import com.demo.main.bean.Banana;
import com.demo.main.bean.Basket;
import com.demo.main.bean.Lemon;
import com.demo.main.bean.Orange;
import com.demo.main.bean.Peache;

import junit.framework.TestCase;

/**
 * @author Java
 *
 */
public class CalculateTotalTest extends TestCase {

	private static CalculateTotal underTest;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		underTest = new CalculateTotal();
	}

	/**
	 * Test method for
	 * {@link com.demo.main.CalculateTotal#getBasketCost(com.demo.main.bean.Basket)}
	 * .
	 */
	public void testGetBasketCost_positive() {
		Basket basket = new Basket();
		basket.add(new Apple(5.5, 3));
		basket.add(new Banana(5.5, 3));
		basket.add(new Lemon(5.5, 3));
		basket.add(new Orange(5.5, 0));
		basket.add(new Peache(5.5, 3));
		basket.add(new Orange(5.5, 3));
		basket.add(new Banana(0, 3));

		assertEquals(82.5, underTest.getBasketCost(basket));
	}

	/**
	 * Test method for
	 * {@link com.demo.main.CalculateTotal#getBasketCost(com.demo.main.bean.Basket)}
	 * .
	 */
	public void testGetBasketCost_zero() {
		Basket basket = new Basket();
		basket.add(null);

		assertEquals(0.0, underTest.getBasketCost(basket));
	}

	/**
	 * Test method for
	 * {@link com.demo.main.CalculateTotal#getBasketCost(com.demo.main.bean.Basket)}
	 * .
	 */

	public void testGetBasketCost_null() {
		assertEquals(0.0, underTest.getBasketCost(null));
	}

	/**
	 * Test method for
	 * {@link com.demo.main.CalculateTotal#getBasketCost(com.demo.main.bean.Basket)}
	 * .
	 */
	public void testGetBasketCost_blank() {
		assertEquals(0.0, underTest.getBasketCost(new Basket()));
	}

}
