package com.prowings.loop;

import java.util.Arrays;

// Write a Java program to sum values of an array.
public class ArrayElementsSum {
	public static void main(String[] args) {
		

		int[] number = { 1, 2, 3, 4 };

		int result = elementsSum(number);
		System.out.println("elements in array are: " + Arrays.toString(number));
		System.out.println("sum of elements of array is: " + result);
	}

	private static int elementsSum(int[] number) {
		int sum = 0;

		for (int n : number) {

			sum += n;
		}
		return sum;
	}

}
