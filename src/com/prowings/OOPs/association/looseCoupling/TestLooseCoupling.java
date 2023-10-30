package com.prowings.OOPs.association.looseCoupling;

public class TestLooseCoupling {

	public static void main(String[] args) {

//		Car car = new Car();
//		Traveler traveler = new Traveler(car);

//		Helicopter helicopter = new Helicopter();
//		Traveller traveller = new Traveller(helicopter);

//		Vehicle vehicle = new Vehicle();   // we can not instantiate interface vehicle
		Vehicle vehicle = new Car(); // Parent interface can hold child // here method of Car is going to call
										// because its runtime object is of car type
//		Vehicle vehicle = new Bus(); 	        // here method of Bus is going to call because its runtime object is of Bus type

//		Vehicle vehicle = new Helicopter(); // here method of Helicopter is going to call because its runtime object is of helicopter type

		Traveler traveller = new Traveler(vehicle);

		traveller.stratJourney();
	}

}
