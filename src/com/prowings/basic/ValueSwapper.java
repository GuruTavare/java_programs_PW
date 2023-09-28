package com.prowings.basic;

import java.util.Scanner;

public class ValueSwapper {
	public static void swapValues(int value1,int value2){
		int temp = value1;
			value1 = value2;
			value2 = temp;
        System.out.println("After Swapping ");
		System.out.println("First value: "+ value1);
		System.out.println("Second value: "+value2);
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First value: ");
		int value1 = sc.nextInt();
		
		System.out.print("Enter the Second value: ");
		int value2 = sc.nextInt();
		
		swapValues(value1,value2);
		sc.close();
	}

}
