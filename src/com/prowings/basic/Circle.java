package com.prowings.basic;

import java.util.Scanner;

public class Circle {
	static float PI =3.14f;
	double radius;
	
	static double calculateArea(double radius){
		return PI*radius*radius;
	}
	static double calculateCircumference(double radius){
		return 2*PI*radius;
	}
	
	public static void main(String[] args){
		System.out.println("Enter the radius of circle: ");
		Scanner sc = new Scanner(System.in); 
		double radius = sc.nextDouble();
		System.out.println("Area of circle is: "+calculateArea(radius));
		System.out.println("Circumference of circle is: "+calculateCircumference(radius));
		sc.close();
	}

}
