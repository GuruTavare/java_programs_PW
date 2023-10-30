package com.prowings.ObjectsMethods;

public class Student implements Cloneable {
	int rollNum;
	String name;
	Address address;
	
	public Student() {
		super();
	}

	public Student(int rollNum, String name, Address address) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address(123,"pune");
		
		Student s1= new Student(10,"Ram", address);
		Student s2=(Student) s1.clone();
		s2.name="Sham";
		s2.address.city="mumbai";
		System.out.println(s1.name);
		System.out.println(s1.rollNum);
		System.out.println(s1.address.city);
		System.out.println(s1.address.pin);
		System.out.println("+=============================+");
		System.out.println(s2.name);
		System.out.println(s2.rollNum);
		System.out.println(s2.address.city);
		System.out.println(s2.address.pin);
	}
}
