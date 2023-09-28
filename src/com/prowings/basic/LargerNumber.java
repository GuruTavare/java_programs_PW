package com.prowings.basic;

import java.util.Scanner;

public class LargerNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		int result = displayLargerNumber(number1,number2,number3);
		
		System.out.print("Larger Number is: "+result);
		sc.close();
	}
	
	public static int displayLargerNumber(int number1,int number2,int number3){
		   int max = number1; // Assume number1 is the largest initially

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        return max;
    }

}
