package com.prowings.loops;

import java.util.Scanner;

public class GradeCalculation {
	
	public static String gradecalculator(int[] marks) {
		int sum=0;
		int avg = 0;
		
		for(int n : marks)              // for-each or Enhanced loop
		{
			sum +=n;
			
			avg= sum/marks.length;
		}	
		 return avg<=40 ? "C Grade":avg>41 && avg<=60 ?"B Grade":avg>61 && avg<=100 ?"A Grade":"Invalid Grade"; 
	}

	public static void main(String[] args) {
		int[] marks =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subject: ");
		
		for(int i=0; i<5 ;i++)
		{
		marks[i] =sc.nextInt();
		}
		
		String grade = gradecalculator(marks);
	
		System.out.println("The grades are: "+grade);
		sc.close();
	}

}
