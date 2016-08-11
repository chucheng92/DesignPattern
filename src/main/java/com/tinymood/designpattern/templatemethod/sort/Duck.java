package com.tinymood.designpattern.templatemethod.sort;

/**
 * 模版方法模式的应用1
 * Java api的sort方法是一个模版方法模式
 * @author taoxiaoran
 *
 */
public class Duck implements Comparable<Duck> {
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Duck o) {
		if (this.weight < o.weight) {
			return -1;
		} else if (this.weight == o.weight) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return name+" weighs "+weight;
	}
}
