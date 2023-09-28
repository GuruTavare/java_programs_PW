package com.prowings.basic;

import java.util.Scanner;

public class Multiplication {
	public static int calculateMultipilcation(int number1, int number2, int number3) {
		return number1 * number2 * number3;
	}

	public static void main(String[] args) {
		System.out.println("Enter Three Values: ");

		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		int multiplication = calculateMultipilcation(number1, number2, number3);

		System.out.println("Multiplication is: " + multiplication);
		sc.close();

	}

}
