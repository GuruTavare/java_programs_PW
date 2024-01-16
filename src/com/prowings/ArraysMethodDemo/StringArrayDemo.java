package com.prowings.ArraysMethodDemo;

import java.util.Arrays;

public class StringArrayDemo {

	public static void main(String[] args) {

		String[] words = { "aaa", "bbb", "zzz", "ggg", "hhh" };

		Arrays.sort(words);// gives natural sorting order
		System.out.println(Arrays.toString(words));

		// here we are trying to sort the array in descending order.(our own sorting
		// order)..by using comparator object
		Arrays.sort(words, new StringArrayDemoDescendingOrder());
		System.out.println(Arrays.toString(words));
	}

}
