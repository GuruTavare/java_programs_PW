package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		// LinkedList<E>

		al.add("Hello");
		al.add("Hi");
		al.add(123);
		al.add("Ram");
		al.add(4, "guru");
		al.add(null);
		al.add(null);
		// al.clear();
		ArrayList cloneAl = (ArrayList) al.clone();
		System.out.println(cloneAl.get(4));
		cloneAl.add(456);
		
		System.out.println(cloneAl);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

		Iterator itr = cloneAl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		ListIterator ltr = cloneAl.listIterator(cloneAl.size());

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

		System.out.println(cloneAl.subList(1, 4));
		cloneAl.toArray();
		System.out.println(cloneAl);
		System.out.println(al);
	}

}
