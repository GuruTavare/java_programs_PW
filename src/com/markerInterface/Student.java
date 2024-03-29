package com.markerInterface;

public class Student implements Cloneable, Deletable {

	int roll;
	String name;
	String address;

	public Student() {
		super();
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public void delete() {
		if (this instanceof Deletable)
			System.out.println("deleted successfully!!");
		else
			throw new RuntimeException("Delete not supported!!");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student(10, "Ram", "Pune");
		Student s2 = (Student) s1.clone();
		
		System.out.println(s2==s1);
		System.out.println("cloned successfully!!");

	}
}
