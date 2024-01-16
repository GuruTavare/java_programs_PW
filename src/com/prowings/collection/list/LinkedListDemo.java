package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}

		LinkedList ll = new LinkedList();
		ll.addAll(al);
		System.out.println(ll);

		System.out.println(ll.containsAll(al));  

		Iterator itr = ll.descendingIterator();

		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
			// ll.add(11);

		}
		System.out.println();
		ListIterator ltr = ll.listIterator();
		while (ltr.hasNext()) {
			//ll.add(11);
			System.out.println(ltr.next());
			// ltr.set(11);
			// ltr.add(11);

		}
		System.out.println();
		// System.out.println(ll);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.pollFirst());
//		System.out.println(ll.peekFirst());
//		System.out.println(ll.element());
//		ll.push(123);
//		System.out.println(ll);
//		System.out.println(ll.pop());
//		System.out.println(ll.remove());
//		System.out.println(ll.poll());
//		System.out.println(ll);

	}

}
