package com.collectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoSort {

	public static void main(String[] args) {
		

		List<String> l = new ArrayList<String>();

		l.add("Java");
		l.add("Python");
		l.add("C");

		System.out.println("Origional list order: " + l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		System.out.println(Collections.max(l));
		System.out.println(Collections.min(l));
		

		//Collections.sort(l);// natural sorting order=Ascending Order

		System.out.println("Ascending order: " + l);
		System.out.println(Collections.binarySearch(l, "Javascript"));// if successful find =index return;; And
																		// Unsuccessful to find then insertion index
																		// will be returned i.e for javaScript -3

		// l.add("Javascript");
		Collections.sort(l, new MyComparator());// Customized sorting order=Descending order

		System.out.println("Descending order: " + l);

		System.out.println(Collections.binarySearch(l, "Javascript", new MyComparator()));// if successful find =index
																							// return;; And Unsuccessful
																							// to find then insertion
																							// index will be returned
																							// i.e for javaScript -2
		System.out.println(Collections.max(l, new MyComparator()));
		System.out.println(Collections.min(l,new MyComparator()));
		
		Collections.shuffle(l);
		System.out.println("After shuffle: "+l);
		
		Collections.rotate(l, 1);
		System.out.println(l);
		
		System.out.println(Collections.singleton("Guru"));
		
		
		
	}

}
