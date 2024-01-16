package com.prowings.Enum;

public class TestEnumLevel {

	public static void main(String[] args) {

		
		Level myLevel=Level.HIGH;
		System.out.println(myLevel.ordinal());
		
		System.out.println("<<<<<<<>>>>>>>>>>>");
		
		for(Level l :Level.values()) {
			System.out.println(l);
		}
		System.out.println("<<<<<<<>>>>>>>>>>>");
		Level myVar = Level.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}

	}

}
