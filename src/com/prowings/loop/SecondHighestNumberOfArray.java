package com.prowings.loop;

import java.util.Arrays;

public class SecondHighestNumberOfArray {

	public static void main(String[] args) {
		
		int[] nums = {10,5,8,12,20,25,16};
		
		System.out.println("Before sorting: "+Arrays.toString(nums));
		
		int result =findSecondHighestNumber(nums);
		
		System.out.println("Second highest number is: "+result);

	}

	private static int findSecondHighestNumber(int[] nums) {
		
		int temp=0;
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				//ascending order 
				if(nums[i]>nums[j]) {              // here we can also use if(nums[i]<nums[j]) i.e Descending order
					
					temp =nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		/*
		 * System.out.println("After sorting:  ");
		 * 
		 * for(int n:nums) { System.out.println(n+" "); }
		 * 
		 * above method prints array in vertical direction to overcome this below 
		 * toString() of Arrays is used.
		 */
		System.out.println("After sorting: "+Arrays.toString(nums));
		return nums[nums.length-6];
	}

}
