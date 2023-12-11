package com.prowings.loop;

import java.util.Arrays;

public class MergedArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {4,5,6};
		
		int [] c =mergedArray(a,b);
		
		System.out.println("After merging the arrays: "+Arrays.toString(c));
		

	}

	private static int[] mergedArray(int[] a, int[] b) {
		
		
		int[] res = new int[a.length+b.length];
		
		for(int i=0; i<a.length;i++) {
			res[i]=a[i];
		}
		
		int counter=0;
		for(int i=a.length;i<res.length;i++) {
			res[i]=b[counter++];
//			counter++;
		}

		return res;
	}

}
