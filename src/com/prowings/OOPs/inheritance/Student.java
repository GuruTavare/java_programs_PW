package com.prowings.OOPs.inheritance;

public class Student extends Person {
	int rollNum;
	int marks;
	public Student(String name,int age,int rollNum,int marks) {
		super(name,age);
		this.rollNum = rollNum;
		this.marks = marks;
	}
	
	  public String toString() { 
		  return "name="+this.name+ 
				  "\nAge ="+this.age +
				  "\nRollNum ="+this.rollNum + 
				  "\nMarks ="+this.marks; }
	 
	
	public static void main(String[] args) {
		Student s = new Student("Ram",28,101,95);
		
		System.out.println(s);
		/*
		 * System.out.println(s.name); System.out.println(s.age);
		 * System.out.println(s.rollNum); System.out.println(s.marks);
		 */
	}

}
