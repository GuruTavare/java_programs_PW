package com.prowings.ArraysMethodDemo;

public class Candidate {
	private int id;
	private String name;

	public Candidate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Candidate() {
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
		return "Candidate [id=" + id + ", name=" + name + "]";
	}

}
