package com.prowings.basic;

import java.util.Scanner;

public class MarksCalculation {
public static double calculateTotalMarks(double s1,double s2,double s3,double s4,double s5){
		
		return s1+s2+s3+s4+s5;
	}
	public static double calculateAverageMarks(double totalMarks){
		
		return totalMarks/5;
	}
	
	public static void main(String[] args){
		System.out.println("Enter 5 subject Marks: ");
		
		Scanner sc = new Scanner(System.in);
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double s3 = sc.nextDouble();
		double s4 = sc.nextDouble();
		double s5 = sc.nextDouble();
		double totalMarks = calculateTotalMarks(s1,s2,s3,s4,s5);
		double averageMarks = calculateAverageMarks(totalMarks);
		System.out.println("5 subjects Total Marks: "+totalMarks);
		System.out.println("5 subject Average Marks: "+averageMarks);
		sc.close();
	}

}
