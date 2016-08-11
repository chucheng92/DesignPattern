package com.tinymood.designpattern.combined.observer;

/**
 * 6.＋观察者模式
 * @author taoxiaoran
 *
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
  
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose()); 

		// 整个鸭群
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		// 绿头鸭群
		Flock flockOfMallards = new Flock();
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
 
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("=== Duck Simulator: With Observer ===");
		Quacklogist quacklogist = new Quacklogist();
		flockOfDucks.registerObserver(quacklogist);
	
		simulate(flockOfDucks);
		
		System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times.");
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
