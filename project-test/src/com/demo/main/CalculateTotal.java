package com.demo.main;

import com.demo.main.bean.Basket;
import com.demo.main.bean.Fruit;

/**
 * Driver class to get total price of a basket
 * 
 * @author Java
 * @version 1.0
 */
public class CalculateTotal {

	/**
	 * Method to calculate total price of basket
	 * 
	 * @param basket
	 * @return sum
	 */
	public double getBasketCost(Basket basket) {
		double sum = 0;
		if (null != basket) {
			for (Fruit fruit : basket.get()) {
				sum += fruit.totalCost();
			}
		}
		return sum;
	}
}
