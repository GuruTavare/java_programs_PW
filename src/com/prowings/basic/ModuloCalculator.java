package com.prowings.basic;

import java.util.Scanner;

public class ModuloCalculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		double number = sc.nextDouble();
		
		double result =moduloBy10(number);
		
		System.out.print("Result after modulo by 10: "+result);
	sc.close();
	}
	public static double moduloBy10(double number){
		return number % 10;
	}

}
