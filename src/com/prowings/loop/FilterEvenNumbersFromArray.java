package com.prowings.loop;

import java.util.Arrays;

public class FilterEvenNumbersFromArray {

	public static void main(String[] args) {

		int[] nums = { 2,15,4,6,8,10,45,69,96,75,12,1};

		int[] result = filterEvenNumbers(nums);

		System.out.println("Filtered even numbers are : ");

		System.out.println(Arrays.toString(result));
	}

	public static int[] filterEvenNumbers(int[] nums) {
		
		System.out.println("Input array is :"+ Arrays.toString(nums));

		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;
			}
		}

		int anotherCounter = 0;
		int[] result = new int[counter];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result[anotherCounter] = nums[i];
				anotherCounter++;
			}
		}

		return result;
	}

}
