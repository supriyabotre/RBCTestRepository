package com.demo.main.bean;

/**
 * 
 * @author Java
 * @version 1.0
 */
public abstract class Fruit {

	/**
	 * @return totalCost
	 */
	public double totalCost() {
		return getUnitPrice() * getQuantity();

	}

	/**
	 * @return quantity
	 */
	abstract protected int getQuantity();

	/**
	 * @return price of single unit
	 */
	abstract protected double getUnitPrice();
}
