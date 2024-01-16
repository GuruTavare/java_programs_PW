package com.prowings.ArrayExercise;

public class ArrayRotationByIndex {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int rotateIndex = 5;

		rotateArray(arr, rotateIndex);

		for (int res : arr) {
			System.out.print(res + " ");
		}
		System.out.println();

	}

	public static void rotateArray(int[] arr, int rotateIndex) {
		int length = arr.length;

		rotateIndex = rotateIndex % length;

		reverseArr(arr, 0, length - 1);

		reverseArr(arr, 0, rotateIndex - 1);

		reverseArr(arr, rotateIndex, length - 1);

	}

	public static void reverseArr(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
