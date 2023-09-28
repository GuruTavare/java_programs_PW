package com.prowings.basic;

import java.util.Scanner;

public class Rectangle {

	static int calculateArea(int number1,int number2){
		return number1*number2;
	}
	public static void main(String[] args){
		System.out.println("Enter 2 sides of Rectangle: ");
		Scanner sc = new Scanner(System.in);
		int number1= sc.nextInt();
		int number2= sc.nextInt();
		
		int area = calculateArea(number1,number2);
		
		System.out.println("Area of Rectangle is: "+area);
		sc.close();
	}
}
