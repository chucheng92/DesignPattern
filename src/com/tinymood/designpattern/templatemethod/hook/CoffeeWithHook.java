package com.tinymood.designpattern.templatemethod.hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding milk and sugar");
	}
	
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if (answer.startsWith("y"))
			return true;
		else
			return false;
	}

	private String getUserInput() {
		String answer = null;
		
		System.out.print("Would you like milk and sugar whit your coffee (y/n)? ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		} catch (Exception e) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null)
			return "no";
		return answer;
	}
}
