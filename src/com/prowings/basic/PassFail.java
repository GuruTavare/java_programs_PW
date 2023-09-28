package com.prowings.basic;

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Marks: ");
		float marks = sc.nextFloat();
		
		displayPassFail(marks);
		
		sc.close();
	}
	static void displayPassFail(float marks){
		if((marks >= 35) &&(marks <=100) ){
			System.out.print("pass: "+marks);
		}else if((marks < 35) && (marks >= 0)){
			System.out.print("Fail: "+marks);
		}else{
			System.out.print("Invalid Marks: "+marks);
		}
	}

}
