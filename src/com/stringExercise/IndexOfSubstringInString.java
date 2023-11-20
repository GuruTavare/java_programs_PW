package com.stringExercise;

public class IndexOfSubstringInString {

	public static void main(String[] args) {
		String s = "Jay Shri Ram";

//		String sub = "Ram";
		String sub = "Jay";
		
		int res = occuranceOfSubString(s,sub);
		System.out.println("Occurance of substring "+""+sub+""+" in string "+""+s+""+" at the index of "+res);
	}

	private static int occuranceOfSubString(String s, String sub) {
		return s.indexOf(sub);
	}

}
