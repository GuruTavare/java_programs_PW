package com.prowings.ArraysMethodDemo;

import java.util.Comparator;

public class StringArrayDemoDescendingOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int res = o1.compareTo(o2);

		if (res >= 0)
			return -3;
		else if (res < 0)
			return 3;
		else
			return 0;
	}

}
