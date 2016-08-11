package com.tinymood.designpattern.combined.decorator;

/**
 * 3.＋装饰者模式
 * @author taoxiaoran
 *
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
  
	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose()); 
		
		System.out.println("===Duck Simulator===");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times.");
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
