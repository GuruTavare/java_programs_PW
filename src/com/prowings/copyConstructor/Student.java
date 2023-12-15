package com.prowings.copyConstructor;

public class Student {
	// fields do not contain any mutable field
	private int id;
	private String name;
	private String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//copy constructor---shallow
	public Student(Student x) {
		this.id = x.getId();
		this.name = x.getName();
		this.address = x.getAddress();
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

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
