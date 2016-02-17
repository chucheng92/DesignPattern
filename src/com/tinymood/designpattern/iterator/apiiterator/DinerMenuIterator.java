package com.tinymood.designpattern.iterator.apiiterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position+1;
		
		return menuItem;
	}

	/* 
	 * Java 8中不需要实现remove方法
	 * 
	 *
	 */
	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Diner Menu Iterator does not support remove()");
	}
	
}
