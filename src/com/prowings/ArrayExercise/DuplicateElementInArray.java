package com.prowings.ArrayExercise;

import java.util.Arrays;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 2, 2, 2, 2, 2, 2, 7, 8, 3, 1, 9 };
		int[] duplicates = findDuplicates(numbers);

		System.out.println("Duplicate elements: " + Arrays.toString(duplicates));
	}

	private static int[] findDuplicates(int[] array) {
		Arrays.sort(array);  
		// System.out.println(Arrays.toString(array));
		int[] duplicates = new int[array.length];

		int count = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				duplicates[count] = array[i];
				count++;
				while (i < array.length - 1 && array[i] == array[i + 1]) {
					i++;
				}
			}
		}
		// System.out.println(Arrays.toString(duplicates));
		return Arrays.copyOf(duplicates, count);
	}
}