package com.tinymood.designpattern.composite.compositeiterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
   
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	/*
	 * Java中不在需要实现remove方法
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


