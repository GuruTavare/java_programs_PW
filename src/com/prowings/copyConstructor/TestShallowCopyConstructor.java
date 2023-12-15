package com.prowings.copyConstructor;

public class TestShallowCopyConstructor {

	public static void main(String[] args) {
		Student s = new Student(10, "Ram", "Pune");
		
		Student s1 = new Student(s);
		
		System.out.println("Before modification : ");

		System.out.println(s);
		System.out.println(s1);

		System.out.println("After modification : ");

		s.setAddress("Mumbai");

		System.out.println(s);
		System.out.println(s1);
	}

}
