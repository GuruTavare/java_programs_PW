package com.prowings.basic;

public class PositiveNegativeNumber {
	public static String checkPositiveNegative(int number) {

		return (number > 0) ? "number is positive" : (number < 0) ? "number is negative" : "number is zero";
	}

	public static void main(String[] args) {
		String result = checkPositiveNegative(-23);
		System.out.println(result);
	}

}
