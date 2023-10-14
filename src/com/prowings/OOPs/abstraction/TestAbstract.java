package com.prowings.OOPs.abstraction;

public abstract class TestAbstract {
	// abstract class can contain both concrete as well as abstract method.

	// also it can contains fields/variables of all types and constructors

	String name;
	int age;

	public TestAbstract() {
		

	}

//	public TestAbstract(String name, int age) {
//
//		this.name = name;
//		this.age = age;
//
//	}

	public abstract void m1(); // abstract method

	void m2() { // concrete method
		System.out.println("inside m2 method");
	}

	
}
