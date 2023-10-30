package com.prowings.OOPs.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		TeacherParent t = new TeacherParent(101,"marathi","Ram","ABC");

		System.out.println(t.getRollNum());
		System.out.println(t.getName());
		System.out.println(t.getSubject());
		System.out.println(t.getSchoolName());
		
	}

}
