package com.prowings.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator<T> implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return -o1.getValue().compareTo(o2.getValue());
	}
//	@Override
//	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//		return o1.getKey().compareTo(o2.getKey());
//	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
