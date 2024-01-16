package com.prowings.ArrayExercise;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int[] num1 = { 20, 30, 20, 15, 16 };

		//System.out.println(Arrays.compare(num, num1));
		System.arraycopy(num, 0, num1, 2, 3);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num1));
	}
}
