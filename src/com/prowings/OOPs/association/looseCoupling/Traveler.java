package com.prowings.OOPs.association.looseCoupling;

public class Traveler {
	
//	
//	Car car;			// here we calling individual classes that lead to more dependability of classes. 
//	
//    public Traveler(Car car) {
//		super();
//		this.car = car;
//	}
//
//	Bus bus;
//	
//	public Traveler(Bus bus) {
//		super();
//		this.bus = bus;
//	}
//
//	Helicopter helicopter; 
//	
//	public Traveller(Helicopter helicopter) {
//		super();
//		this.helicopter = helicopter;
//	}

	Vehicle vehicle;  // here only interface ref. created to avoid tight coupling like car ,bus ,helicopter.

	public Traveler() {
		super();
	}

	public Traveler(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void stratJourney() {
//		bus.start();
//		car.start();
		vehicle.start();
		System.out.println("Journey Started");
	}

}
