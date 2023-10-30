package com.prowings.OOPs.association.composition;

public class TestComposition {

	public static void main(String[] args) {
		
		Engine engine = new Engine("V12",true,true);
		
		Car car = new Car("Harrier",2023,engine);
		
		car.startJourney();
	}

}
