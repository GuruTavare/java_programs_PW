package com.prowings.StringClass;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1 = "You cannot change me";// scp

		final String s2 = "You cannot";// scp

		String s3 = s2 + " change me";// scp

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s3));

		String s4 =new String("hello");
		
		final String s5 =s4+" World";
		
		String s6 ="hello World";
		
		System.out.println(s4==s5);
		System.out.println(s5==s6);
		
		String s7="you can not"+" change me";//scp
		String s8="you can not change me";
		System.out.println(s7==s8);
		
		final String a1="guru";
		String a2=a1.concat("tavare");
		String a3 ="gurutavare";
		System.out.println(a3==a2);
		

	}

}
