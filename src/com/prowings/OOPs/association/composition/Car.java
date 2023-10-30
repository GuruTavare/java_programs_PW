package com.prowings.OOPs.association.composition;

public class Car {

	String name;
	int model;
	Engine engine;

	public Car() {

	}

	public Car(String name, int model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}

	public void startJourney() {
		if (engine != null)										// NullPointer Exception handling
			if (engine.strat()) {
				System.out.println("Journey has Started!!");
			} else
				System.out.println("could not start the journey without starting the car.");
	}
}
