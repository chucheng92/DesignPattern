package com.tinymood.designpattern.iterator.apiiterator;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
		
	/* 
	 * Java 8中不需要实现remove方法
	 * 
	 * 
	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Diner Menu Iterator does not support remove()");
	}
	*/
}
