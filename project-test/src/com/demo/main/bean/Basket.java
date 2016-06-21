package com.demo.main.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Java
 * @version 1.0
 */
public class Basket {
	/**
	 * 
	 */
	private List<Fruit> fruits;

	/**
	 * 
	 * @param item
	 */
	public void add(Fruit item) {
		if (null == fruits) {
			fruits = new ArrayList<Fruit>();
		}
		if (null != item) {
			fruits.add(item);
		}
	}

	/**
	 * 
	 * @return
	 */
	public List<Fruit> get() {
		return null != fruits ? fruits : new ArrayList<Fruit>();
	}
}
