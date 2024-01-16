package com.prowings.collection.list;

import java.util.ArrayList;

public class OeprationsOnArrayList {

//	static ArrayList al = new ArrayList<>();

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(40);
		System.out.println(al);
//		reverseArrayList(al);
		findAndRemoveDuplicates(al);

	}

	public static void findAndRemoveDuplicates(ArrayList<?> al) {
		// TODO Auto-generated method stub
		for (int i = 0; i < al.size(); i++) {

			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j))
					System.out.println(al.remove(j));
			}
			//System.out.println(al);
		}
		
		
		//System.out.println(al);
	}

	public static void reverseArrayList(ArrayList<?> al) {

		// for (int i = al.size()-1; i >= 0; i--)
//			System.out.println(al.get(i));\

		int index = al.size() - 1;
		while (index >= 0) {
			System.out.println(al.get(index));
			index--;
		}

	}
}