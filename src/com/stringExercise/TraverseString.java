package com.stringExercise;

public class TraverseString {

	public static void main(String[] args) {

		String s = "guruprasad";

		traverseString(s);

	}

	public static void traverseString(String s) {

//		String[] str = s.split("");

//		for(String ch:str)
//			System.out.print(ch+" ");
		
		char[] c = s.toCharArray();

		for (char ch : c)
			System.out.print(ch + " ");

	}

}
