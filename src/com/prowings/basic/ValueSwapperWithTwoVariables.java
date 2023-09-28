package com.prowings.basic;

import java.util.Scanner;

public class ValueSwapperWithTwoVariables {
	
	public static void swapValues(int a,int b){
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping ");
		System.out.println("First value: "+ a);
		System.out.println("Second value: "+ b);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First value: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second value: ");
		int b = sc.nextInt();
		
		swapValues(a,b);
		sc.close();
	}

}
