package com.prowings.OOPs.Encapsulation;
//Example of POJO class--A class having private data and getter-setter methods.
public class TeacherParent {
	private int rollNum;
	private String subject;
	private String name;
	private String schoolName="ABC";
	
	public TeacherParent(int rollNum, String subject, String name,String schoolName) {
		super();
//		this.rollNum = rollNum;
		this.setRollNum(rollNum);
//		this.subject = subject;
		this.setSubject(subject);
//		this.name = name;
		this.setName(name);
//		this.schoolName=schoolName;
		this.setSchoolName(schoolName);
		
	}
	
	public int getRollNum() {
		return rollNum;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public  String getSchoolName() {
		return schoolName;
	}

	public  void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	
	
}