package com.prowings.loop;

import java.util.Scanner;

public class GradeCalculation {

	public static String gradecalculator(int[] marks) {
		int sum = 0;
		int avg = 0;

		for (int n : marks) // for-each or Enhanced loop
		{
			sum += n;
		}
		avg = sum / marks.length;

		return avg > 0 && avg <= 40 ? "C Grade"
				: avg > 41 && avg <= 60 ? "B Grade" : avg > 61 && avg <= 100 ? "A Grade" : "Invalid Grade";

		/*
		 * if (avg > 0 && avg <= 40) return "c grade";
		 * 
		 * else if (avg > 41 && avg <= 60) return "b grade";
		 * 
		 * else if (avg > 61 && avg <= 100) return "a grade";
		 * 
		 * else return "Invalid Grade";
		 */

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subject: ");
		int num =sc.nextInt();
		
		int [] marks = new int[num];  
		
		System.out.println("Enter the marks of "+num+"subjects : ");
		
		for (int i = 0; i < num; i++) {
			marks[i] = sc.nextInt();  
		}

		String grade = gradecalculator(marks);

		System.out.println("The grade is : " + grade);
		sc.close();
	}

}
