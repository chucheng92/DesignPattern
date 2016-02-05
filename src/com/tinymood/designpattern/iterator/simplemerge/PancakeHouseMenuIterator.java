package com.tinymood.designpattern.iterator.simplemerge;

import java.util.ArrayList;

/**
 * 自己实现Iterator接口
 * @author taoxiaoran
 *
 */
public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items.get(position);
		position = position+1;
		
		return item;
	}

}
