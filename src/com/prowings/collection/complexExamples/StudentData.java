package com.prowings.collection.complexExamples;

import java.util.Comparator;

public class StudentData implements Comparator<StudentData> {

	private int rollNum;
	private String name;
	private int Marks;

	public StudentData(int rollNum, String name, int marks) {
		this.rollNum = rollNum;
		this.name = name;
		Marks = marks;
	}

	public StudentData() {
		super();
	}

	public int getRollNum() {
		return rollNum;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student name is: "+name+"\n Roll Number: "+rollNum+"\n marks are: "+Marks;
	}

//	@Override
//	public int compareTo(Student o) {
//		if(this.Marks==o.Marks)
//			return 0;
//		else if(this.Marks>o.Marks)
//			return -1;
//		else
//			return 1;
//	}

	@Override
	public int compare(StudentData o1, StudentData o2) {
		if (o1.Marks == o2.Marks)
			return 0;
		else if (o1.Marks > o2.Marks)
			return -1;
		else
			return 1;
	}

}
