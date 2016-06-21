package com.demo.main.bean;

/**
 * 
 * @author Java
 * @version 1.0
 */
public class Lemon extends Fruit {

	/**
	 * cost of single
	 */
	private double cost;

	/**
	 * total quantity
	 */
	private int quantity;

	/**
	 * 
	 * @param cost
	 * @param quantity
	 */
	public Lemon(double cost, int quantity) {
		this.cost = cost;
		this.quantity = quantity;
	}

	/**
	 * get quantity
	 */
	@Override
	protected int getQuantity() {
		return quantity;
	}

	/**
	 * get unit price of apple
	 */
	@Override
	protected double getUnitPrice() {
		return cost;
	}

}
