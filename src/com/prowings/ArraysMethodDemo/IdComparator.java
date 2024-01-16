package com.prowings.ArraysMethodDemo;

import java.util.Comparator;

public class IdComparator implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		if (o1.getId() == o2.getId())
			return 0;
		else if (o1.getId() > o2.getId())
			return 1;
		else
			return -1;
	}

}
