package com.prowings.ArraysMethodDemo;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {

		//return this.getName().compareTo(o.getName());
		return this.name.compareTo(o.name);
	}

//	@Override-----Natural Order Ascending
//	public int compareTo(Student o) {
//		if (this.getId() == o.getId())
//			return 0;
//		else if (this.getId() > o.getId())
//			return 3;
//		else
//			return -3;
//
//	}
//	@Override-----Descending order
//	public int compareTo(Student o) {
//		if (this.getId() == o.getId())
//			return 0;
//		else if (this.getId() > o.getId())
//			return -3;
//		else
//			return 3;
//		
//	}

}
