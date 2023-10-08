package com.prowings.loop;

import java.util.Arrays;

// the size of the array should be same
public class AdditionOfTwoArray2 {

	public static void main(String[] args) {

		int[] a = { 12, 23, 44, 55, 66, 100,20,30 };
		int[] b = { 21, 32, 52, 54, 62, 1 ,1,1,1,1};

		System.out.println("a array is: " + Arrays.toString(a));
		System.out.println("b array is: " + Arrays.toString(b));
		int[] c = findAdditionOfTwoArray(a, b);

		System.out.println("Addition of two arrys a & b is: " + Arrays.toString(c));
	}

	private static int[] findAdditionOfTwoArray(int[] a, int[] b) {
		int size = a.length > b.length ? a.length : b.length; // ternary operator

		/*
		 * int size =0;
		 * 
		 * if(a.length>b.length) { size =a.length; }else { size=b.length; }
		 */

		int[] res = new int[size];

		for (int i = 0; i < size; i++) {
			int num1 =i<a.length ? a[i]:0;                    //here we have used ternary operator
			int num2 =i<b.length ? b[i]:0;
			/*
			 * int num1 = 0; int num2 = 0; if (i < a.length) { num1 = a[i]; } else { num1 =
			 * 0; } if (i < b.length) { num2 = b[i]; } else {
			 * 
			 * num2 = 0; }
			 */

			res[i] = num1 + num2;

		}
		return res;
	}

}
