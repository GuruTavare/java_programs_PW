package com.stringExercise;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s="Hello";
		char oldChar='l';
		char newChar ='&';
		String rep = replaceChar(s,oldChar,newChar);

		System.out.println("Original String: " + s);
		System.out.println("String AfterReplacingChar: " + rep);
	}

	public static String replaceChar(String s,char oldChar,char newChar) {
		
		return s.replace(oldChar,newChar);
	}

}
