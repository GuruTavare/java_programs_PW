package com.stringExercise;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman Number ");

		String s = sc.nextLine().toUpperCase();
		
		System.out.println(s.compareTo(s));
		System.out.println(convertRomanToInt(s));
		sc.close();
	}

	public static int convertRomanToInt(String s) {
//		s = s.toUpperCase();

		int result = 0, currentValue = 0, prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char romanValue = s.charAt(i);

			switch (romanValue) {
			case 'I':
				currentValue = 1;
				break;
			case 'V':
				currentValue = 5;
				break;
			case 'X':
				currentValue = 10;
				break;
			case 'L':
				currentValue = 50;
				break;
			case 'C':
				currentValue = 100;
				break;
			case 'D':
				currentValue = 500;
				break;
			case 'M':
				currentValue = 1000;
				break;
			}

			if (currentValue < prevValue)
				result -= currentValue;
			else
				result += currentValue;
			prevValue = currentValue;

		}

		return result;
	}

}
