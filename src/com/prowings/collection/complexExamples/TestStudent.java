package com.prowings.collection.complexExamples;

import java.util.*;


public class TestStudent {

	public static void main(String[] args) {

//		Set<StudentData> l = new TreeSet<StudentData>(new StudentData());

//		l.add(new StudentData(101, "Ram", 90));
//		l.add(new StudentData(102, "Sham", 35));
//		l.add(new StudentData(103, "Bharat", 60));
//		l.add(new StudentData(104, "parth", 45));
//		l.add(new StudentData(105, "sumit", 62));
//		l.add(new StudentData(106, "Bhushan", 80));
		List<StudentData> s1 = new ArrayList<StudentData>();
		s1.add(new StudentData(101, "Ram", 90));
		s1.add(new StudentData(102, "Sham", 35));
		s1.add(new StudentData(103, "Bharat", 60));
		s1.add(new StudentData(104, "parth", 45));
		s1.add(new StudentData(105, "sumit", 62));
		s1.add(new StudentData(106, "Bhushan", 80));

		Collections.sort(s1, new StudentData());
		;

		// System.out.println(l);

		findSecondHighestMarks(s1);

	}

	public static void findSecondHighestMarks(List<StudentData> l) {

		// List<StudentData> l1 = new LinkedList<StudentData>(l);
		// System.out.println(l1);
		System.out.println("Second Highest marks Student Details: " + "\n " + l.get(1));

	}

}
