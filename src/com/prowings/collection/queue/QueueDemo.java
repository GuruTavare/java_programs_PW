package com.prowings.collection.queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {

		Deque<String> d = new ArrayDeque<>();
		System.out.println(d.element());  // NoSuchElementException 
		Queue<String> q = new PriorityQueue<>();
		q.offer("z");
		q.offer("l");
		q.offer("k");
		q.offer("a");

		System.out.println(q);
		q.add("b");
		System.out.println(q);
		q.offer("c");
		System.out.println(q);
		q.remove();

	}

}
