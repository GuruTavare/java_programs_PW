package com.stringExercise;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String s1 = "heart";
//		String s1 = "angle";
		String s2 = "earth";
//		String s2 = "angel";
		System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not Anagram");
	}

	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.replaceAll(" ", "").toLowerCase();
		s2 = s2.replaceAll(" ", "").toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}
		char[] array1 = s1.toCharArray();
//		System.out.println(array1);
		char[] array2 = s2.toCharArray();
//		System.out.println(array2);
		Arrays.sort(array1);
//		System.out.println(array1);
		Arrays.sort(array2);
//		System.out.println(array2);

		return Arrays.equals(array1, array2);
	}

}
