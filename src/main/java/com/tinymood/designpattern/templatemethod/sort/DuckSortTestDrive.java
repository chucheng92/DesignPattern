package com.tinymood.designpattern.templatemethod.sort;

import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Daffy", 8),
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Donald",10)
		};
		
		System.out.println("Before sorting:");
		dispaly(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter sorting:");
		dispaly(ducks);
	}
	
	private static void dispaly(Duck[] ducks) {
		for (int i=0; i<ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
