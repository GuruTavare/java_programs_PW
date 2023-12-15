package com.prowings.ArrayExercise;

import java.util.Arrays;

public class ArrayUnionAndIntersection {

	public static void main(String[] args) {

		int[] num1 = { 10, 20, 30 };

		int[] num2 = { 10, 20, 30, 70, 80, 90, 100 };

		System.out.println("After Union : " + Arrays.toString(UnionOfArray(num1, num2)));

		System.out.println("After Intersection: " + Arrays.toString(intersectionOfArrays(UnionOfArray(num1, num2))));

	}

	public static int[] intersectionOfArrays(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					nums[j] = nums[n - 1];
					n--;
					j--;
				}
			}
		}
		int[] result = Arrays.copyOf(nums, n);
		return result;
	}

	public static int[] UnionOfArray(int[] num1, int[] num2) {

		int[] result = new int[num1.length + num2.length];

		int memory = 0;
		for (int i = 0; i < num1.length; i++) {
			result[memory] = num1[i];
			memory++;
		}
		for (int j = 0; j < num2.length; j++) {
			result[memory] = num2[j];
			memory++;
		}
		return result;
	}
}
