package com.prowings.ArraysMethodDemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
