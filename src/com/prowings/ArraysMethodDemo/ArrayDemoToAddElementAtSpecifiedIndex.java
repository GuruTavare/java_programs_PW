package com.prowings.ArraysMethodDemo;

import java.util.Arrays;

public class ArrayDemoToAddElementAtSpecifiedIndex {

	public static void main(String[] args) {
		
		int[]num = {1,2,3,4,5};
		
		int indexAtAdd=2;
		int numToAdd=10;
		
		System.out.println(Arrays.toString(num));
		
		int[]newArray=new int[num.length+1];
		
		for(int i=0;i<indexAtAdd;i++) {
			newArray[i]=num[i];
		
		}
		System.out.println(Arrays.toString(newArray));
		
		newArray[indexAtAdd]=numToAdd;
		
		System.out.println(Arrays.toString(newArray));
		
		for(int i=indexAtAdd+1;i<newArray.length;i++) {
			newArray[i]=num[i-1];
		}
		System.out.println(Arrays.toString(newArray));
		
	}

}
