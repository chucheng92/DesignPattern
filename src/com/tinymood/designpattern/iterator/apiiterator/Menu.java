package com.tinymood.designpattern.iterator.apiiterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
