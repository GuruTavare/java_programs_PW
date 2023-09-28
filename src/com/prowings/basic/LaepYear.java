package com.prowings.basic;

import java.util.Scanner;

public class LaepYear {
	public static boolean isLeapYear(int year) {

		/*
		 * if(year % 4 ==0) { if((year % 100 == 0)&&(year % 400==0)) return true; else
		 * return false; } else return false;
		 */
		// return ((year%4==0)&&(year%400==0))?true:(year%100!=0)?false:true;

		return (year % 4 == 0) ? ((year % 100 == 0) && (year % 400 == 0)) ? true : false : false;

	}

	public static void main(String[] args) {
		System.out.print("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (isLeapYear(year))
			System.out.println(year + " is leap year");
		else
			System.out.println(year + " is not leap year");
		sc.close();
	}

}
