package com.prowings.basic;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the basic salary: ");
		
		double basicSalary = sc.nextDouble();
		double hra = hra(basicSalary);
		double ta = ta(basicSalary);
		double da = da(basicSalary);
		double ma = ma(basicSalary);
		double pf = pf(basicSalary);
		
		double salary = netSalary(basicSalary,hra,ta,da,ma,pf);
		System.out.println("HRA 45% : "+hra);
		System.out.println("TA 25% : "+ta);
		System.out.println("DA 30% : "+da);
		System.out.println("Deduction parameters:");
		System.out.println("MA 5% : "+ma);
		System.out.println("PF 25% : "+pf);
		System.out.println("Deduction Amount:"+(ma+pf));
		System.out.println("After Deduction Net salary: "+salary);
		sc.close();
	}
	static double hra(double basicSalary){
		return basicSalary*0.45;
	}
	static double ta(double basicSalary){
		return basicSalary*0.25;
	}
	static double da(double basicSalary){
		return basicSalary*0.30;
	}
	static double ma(double basicSalary){
		return basicSalary*0.05;
	}
	static double pf(double basicSalary){
		return basicSalary*0.25;
	}
	static double netSalary(double basicSalary,double hra,double ta,double da,double ma,double pf){
		return basicSalary + hra + ta + da - ma - pf;
	}

}
