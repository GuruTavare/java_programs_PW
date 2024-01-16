package com.prowings.ArraysMethodDemo;

import java.util.Arrays;

public class TestComparableStudent {

	public static void main(String[] args) {

		Student s1 = new Student(10, "BBB");
		Student s2 = new Student(20, "AAA");
		Student s3 = new Student(30, "DDD");
		Student s4 = new Student(40, "CCC");

		Student[] std = { s4, s1, s2, s3 };
		Arrays.sort(std);
		System.out.println(Arrays.toString(std));

	}

}
