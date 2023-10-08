package com.prowings.loop;

import java.util.Arrays;

// the size of the array should be same
public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int [] a = {12,23,44,55,66,100};
		int [] b = {21,32,52,54,62,1};
		
		System.out.println("a array is: "+Arrays.toString(a));
		System.out.println("b array is: "+Arrays.toString(b));
		int [] c = findAdditionOfTwoArray(a,b);
		
		System.out.println("Addition of two arrys a & b is: "+Arrays.toString(c));
	}

	private static int[] findAdditionOfTwoArray(int[] a, int[] b) {
		int [] c= new int[a.length];
		if(a.length==b.length) {
			
			for(int i=0,j=0,k=0;i<a.length;i++,j++,k++) {
				c[k] =a[i]+b[j];
			}
		}else {
			System.out.println("size of the arrays should be same");
		}
		
		return c;
	}

}
