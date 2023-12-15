package com.prowings.copyConstructor;

public class TestDeepCopyConstructor {

	public static void main(String[] args) {
		
		Address add = new Address(1234, "pune","India");
		
		NewStudent ns = new NewStudent(10, "Ram", add);
		
		NewStudent ns1 = new NewStudent(ns);
		

		System.out.println("Before modification : ");

		System.out.println(ns);
		System.out.println(ns1);

		System.out.println("After modification : ");

		ns.getAddress().setCity("mumbai");

		System.out.println(ns);
		System.out.println(ns1);
	}

}
