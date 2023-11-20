package com.prowings.basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		if (isPalindrome(number))
			System.out.println(number + " number is palindrome number.");
		else
			System.out.println(number + " number is not palindrome number.");

		scanner.close();
	}

	private static boolean isPalindrome(int number) {
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
