package com.prowings.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TreeDemo {
	public static void main(String[] args) {

		// TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		HashMap<String, Integer> t = new HashMap<String, Integer>();

		t.put("xxx", 40);
		t.put("aaa", 20);
		t.put("ccc", 81);
		t.put("jjj", 60);
		t.put("kkk", 10);
		t.put("nnn", 9);

		System.out.println(t);

		List<Map.Entry<String, Integer>> l = new ArrayList<>(t.entrySet());

		Collections.sort(l, new MyComparator<Map.Entry<String, Integer>>());
//		{
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//
//		});

		System.out.println(l);

		Iterator itr = t.values().iterator();

		while (itr.hasNext()) {
			Integer value =(Integer)itr.next();
			
			System.out.println(value);
		}

	}
}
