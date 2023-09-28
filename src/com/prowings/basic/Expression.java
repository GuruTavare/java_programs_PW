package com.prowings.basic;

import java.util.Scanner;

public class Expression {
	public static double calculateExpression(int x,int y){
		return (4*Math.pow(x,2)+5*Math.pow(y,3))/(2*x*y);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		
		double z = calculateExpression(x,y);
		
	
		System.out.println("The value of expression is: "+z);
		sc.close();
	}

}
