package com.prowings.customexception;

public class Voter {

	private int age;
	private String country;

	public Voter() {
		super();
	}

	public Voter(int age, String country) {
		super();
		this.age = age;
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
