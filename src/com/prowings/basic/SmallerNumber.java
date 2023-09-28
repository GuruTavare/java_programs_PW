package com.prowings.basic;

import java.util.Scanner;

public class SmallerNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Four numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		
		int result = displaySmallerNumber(number1,number2,number3,number4);
		
		System.out.print("Smaller Number is: "+result);
		sc.close();
	}
	
	public static int displaySmallerNumber(int number1,int number2,int number3,int number4){
		if(number1 <= number2 && number1 <= number3 && number1 <= number4){
			return number1;
		}else if(number2 <= number1 && number2 <= number3 && number2 <= number4){
			return number2;
		}else if(number3 <= number1 && number3 <= number2 && number3 <= number4){
			return number3;
		}else{
			return number4;
		}
	}

}
