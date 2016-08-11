package com.tinymood.designpattern.composite.compositeiterator;
 
import java.util.Iterator;
  
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	/*
	 * Java8不需要实现remove方法
	 * 
	 */
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
