package com.prowings.ArrayExercise;

public class ArrayElementSum {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, -50 };
		sumOfArrayElements(nums);
	}

	public static void sumOfArrayElements(int[] nums) {
		int totalSum = 0;
		for (int x : nums)
			totalSum += x;

		System.out.println("Sum of arrays element is: " + totalSum);
	}

}
