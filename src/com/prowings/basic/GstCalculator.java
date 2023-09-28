package com.prowings.basic;

import java.util.Scanner;

public class GstCalculator {
	public static double gstAmount(double billAmount){
		return billAmount*0.18;
	}
	
	public static double netAmount(double billAmount, double gst){
	   return billAmount + gst;
	}
	
	public static void main(String[] args){
		System.out.println("Enter Bill Amount: ");  
		
		Scanner sc = new Scanner(System.in);
		double billAmount = sc.nextDouble();
		
		double gst = gstAmount(billAmount);
		double net = netAmount(billAmount,gst);
		System.out.println("GST Amount is: "+gst);
		System.out.println("Net Amount is: "+net);
		sc.close();
	}

}
