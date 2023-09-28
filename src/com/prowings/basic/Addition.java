package com.prowings.basic;

import java.util.Scanner;

public class Addition {
	public static int calculateAddition(int number1, int number2){
		return number1 + number2;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int addition = calculateAddition(number1,number2);
		System.out.println("Addition is: "+addition);
		sc.close();
	}
}


