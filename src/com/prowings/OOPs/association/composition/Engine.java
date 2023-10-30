package com.prowings.OOPs.association.composition;

public class Engine {

	String name;
	boolean fuel;
	boolean engineOil;

	public Engine() {

	}

	public Engine(String name, boolean fuel, boolean engineOil) {
		super();
		this.name = name;
		this.fuel = fuel;
		this.engineOil = engineOil;
	}

	public boolean strat() {
		if (fuel && engineOil) {
			System.out.println("Engine started");
			return true;
		}else {
			
			System.out.println("Could not start the engine without fuel & engine oil");
			return false;
		}

	}

}
