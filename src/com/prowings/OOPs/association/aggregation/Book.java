package com.prowings.OOPs.association.aggregation;

public class Book {

	private String title;
	private String auther;
	private String type;

	public Book() {
		super();
	}

	public Book(String title, String auther, String type) {
		super();
		this.title = title;
		this.auther = auther;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
