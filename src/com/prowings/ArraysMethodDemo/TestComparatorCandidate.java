package com.prowings.ArraysMethodDemo;

import java.util.Arrays;

public class TestComparatorCandidate {

	public static void main(String[] args) {

		Candidate c1 = new Candidate(10, "Ram");
		Candidate c2 = new Candidate(30, "Ram");
		Candidate c3 = new Candidate(20, "Ram");
		Candidate c4 = new Candidate(40, "Ram");
		c2.setName("Parth");
		c3.setName("Sai");
		c4.setName("alaji");

		Candidate[] ctd = { c4, c2, c3, c1 };
		// Arrays.sort(ctd,new NameComparator());
		// Arrays.sort(ctd,new IdComparator());
		System.out.println(Arrays.toString(ctd));
	}

}
