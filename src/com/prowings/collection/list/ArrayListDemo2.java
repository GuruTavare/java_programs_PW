package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		al1.add("ddd");

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(123);
		al2.add(456);
		al2.add(789);

		ArrayList<StringBuffer> al3 = new ArrayList<>();
		al3.add(new StringBuffer("qqq"));
		al3.add(new StringBuffer("ppp"));
		al3.add(new StringBuffer("rrr"));
		
		ArrayList<ArrayList> complexList = new ArrayList<>();
		complexList.add(al1);
		complexList.add(al3);
		complexList.add(al2);
		
		System.out.println(complexList);
		

	}
}
