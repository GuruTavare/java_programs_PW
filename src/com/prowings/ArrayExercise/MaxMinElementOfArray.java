package com.prowings.ArrayExercise;

public class MaxMinElementOfArray {

	public static void main(String[] args) {

		int[] numbers = { 15, 32, 8, 201, 3077 };

		maxMinNumber(numbers);

	}

	public static void maxMinNumber(int[] numbers) {
		int min = numbers[0];
		int max = numbers[0];

//		for (int i = 1; i < numbers.length; i++) {
//			min = Math.min(min, numbers[i]);
//			max = Math.max(max, numbers[i]);
//		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			if (numbers[i] > max)
				max = numbers[i];
		}

		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);

	}

}
