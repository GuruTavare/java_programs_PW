package com.prowings.basic;

import java.util.Scanner;

public class LoanCalculator {
	public static double interestAmount(double loneAmount){
		return loneAmount * 1 * 0.12;
	}
	
	public static double totalAmount(double loneAmount, double interest){
	   return loneAmount + interest;
	}
	
	public static void main(String[] args){
		System.out.println("Enter Lone Amount: ");  
		
		Scanner sc = new Scanner(System.in);
		double loneAmount = sc.nextDouble();
		
		double interest = interestAmount(loneAmount);
		double total = totalAmount(loneAmount,interest);
		System.out.println("Interest amount for 12% rate is: "+interest);
		System.out.println("Total Amount is: "+total);
		sc.close();
	}

}
