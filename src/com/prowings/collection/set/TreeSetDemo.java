package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		
//		t.add(null);
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		
		System.out.println(t);
		
	}

}
 