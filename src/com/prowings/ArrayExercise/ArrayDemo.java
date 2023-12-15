package com.prowings.ArrayExercise;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		char ch ='a';
		int[] nums = new int[5];
		
		System.out.println(nums.length);
		System.out.println(nums);
		nums[0]=10;
		nums[1]=-20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
		//storing one array element into another array
		int [] num = new int[nums.length];
		for(int i=0;i<num.length;i++) {
			num[i]=nums[i];
		}
		System.out.println(Arrays.toString(num));
		//reverse of an array
		int[] reverse=new int [nums.length];
		int count=0;
		for(int i=reverse.length-1;i>=0;i--) {
			reverse[count]=nums[i];
			count++;
		}
		System.out.println(Arrays.toString(reverse));
		// square of element 
		
		int[] square=new int[nums.length];
		
		for(int i = 0;i<square.length;i++) {
			square[i]=nums[i]*nums[i];
		}
		System.out.println(Arrays.toString(square));
		
		
	}

}
