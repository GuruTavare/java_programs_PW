package com.prowings.collection.set;

import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		// String s1= "VAibhav";
		StringBuffer s2 = new StringBuffer("Khalipe");
		StringBuffer s3 = new StringBuffer("Khalipedada");
		StringBuffer s1 = new StringBuffer("Khalipemama");
//		StringBuilder s3 = new StringBuilder("Pune");

		t.add(s3);
		t.add(s1);
		t.add(s2);
		// t.descendingSet(); 
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
