package com.stringExercise;

public class PalindromeString {
	public static void main(String[] args) {
		String word="RADaR";
		int number = 123;
		System.out.println(isPalindromeString(word)?"palindrome":"not palindrome");
		System.out.println(isPalindromeNumber(number)?"palindrome":"not palindrome");
	}

	public static boolean isPalindromeString(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String s = sb.toString();
//		System.out.println(s);
		return s.equals(word);
	}
	private static boolean isPalindromeNumber(int number) {
		int originalNumber = number;

		int reversedNumber = 0;

		while (number > 0) {
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}

		return originalNumber == reversedNumber;
	}
}