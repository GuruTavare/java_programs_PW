package com.stringExercise;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = " Hello World ";
		String removedSpace = removeWhiteSpaces(s);
		
		System.out.println("original string:" + s);
		System.out.println("removedSpace string:" + removedSpace);
	}

	public static String removeWhiteSpaces(String s) {

		return s.replaceAll(" ", "");
	}

}
