package com.prowings.ArrayExercise;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 40, 50, 60 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int searchValue = sc.nextInt();

		int position = -1;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == searchValue) {
				position = i;
				break;
			}

		}
		if (position != -1) {
			System.out.println("Value found at position " + position);
		} else {
			System.out.println("Value not found in the array.");
		}
		sc.close();
	}

}
