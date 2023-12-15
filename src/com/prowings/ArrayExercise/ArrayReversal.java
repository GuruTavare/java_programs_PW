package com.prowings.ArrayExercise;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {

		int[] nums = {10,20,30,40,50};
		
		reversalArray(nums);
	}

	public static void reversalArray(int[] nums) {
		int []reverse = new int[nums.length];
		int count=0;
		for(int i= nums.length-1;i>=0;i--) {
			reverse[count]=nums[i];
			count++;
		}
		System.out.println(Arrays.toString(reverse));
	}

	

}
