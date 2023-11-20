package com.prowings.StringClass;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String name = sc.nextLine();
//		String name1 = sc.nextLine();

//		System.out.println(name.length()+name1.length());
//		System.out.println("Reversed name: " + reverseString(name));
		System.out.println("Reversed name: " + reverseArrayToString(name));
		sc.close();
	}

	/*
	 * public static String reverseString(String name) { String rev = ""; for (int i
	 * = name.length() - 1; i >= 0; i--) { rev = rev + name.charAt(i); }
	 * 
	 * return rev; }
	 */

	public static String reverseArrayToString(String name) {
		char[] data = name.toCharArray();
		char[] res = new char[data.length];
		int count = 0;
		for (int i = data.length - 1; i >= 0; i--) {
			res[count] = data[i];
			count++;
		}
//		System.out.println(res);
		return new String(res);

	} 

//		StringBuilder sb = new StringBuilder(name);
//		sb.reverse();
//		return sb.toString();
//	}

}
