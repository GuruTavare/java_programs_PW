package com.prowings.ArrayExercise;

import java.util.Arrays;

public class UniqueElementsInArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 3, 4, 2, 3, 1, 5, 6, 7, 8, 8, 7, 4, 2, 1, 5, 3, 2, 1 };

		//uniqueElements(nums);
		System.out.println("Unique Elements are: "+Arrays.toString(ArrayUnionAndIntersection.intersectionOfArrays(nums)));
	}

//	public static void uniqueElements(int[] nums) {
//
//		int n = nums.length;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (nums[i] == nums[j]) {
//					nums[j] = nums[n - 1];
	
//					n--;
//					j--;
//				}
//		//		System.out.print(nums[j]+" ");
//			}
//		}
// 
//		int[] result = Arrays.copyOf(nums, n);
//		System.out.println("Unique Elements are: " + Arrays.toString(result));
//
//	}

}
