package com.prowings.ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayDemoAsList  {
	public static void main(String[] args) {

		//Integer[] nums = { 10, 20, 30, 40, 50, 10, 20, 30, 40 };
		Integer[] nums = { 10, 20, 30, 40, 50, 10, 20, 30, 40,2,2,2,2,2,2,22,3,3,3,3,3,3};
		//Arrays.sort(nums);
		List<Integer> list = Arrays.asList(nums);

		System.out.println(list);
		
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		System.out.println(hs);
		
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		  
	}

}
