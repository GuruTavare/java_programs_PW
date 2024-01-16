package com.prowings.ArraysMethodDemo;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReflectionCodeforPrivateCapacity {

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> al = new ArrayList<>();

		System.out.println("Initial Capacity : " + getCapacity(al)); // ==zero
		al.add(1);
		System.out.println("Initial Capacity : " + getCapacity(al)); // ==Ten
		al.add(2);
		al.add(3);
		al.add(124);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		System.out.println("New Capacity: "+getCapacity(al));//==15
		System.out.println("Size : " + al.size());

	}

	public static int getCapacity(ArrayList<Integer> l) throws Exception {
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		return ((Object[]) dataField.get(l)).length;
	}

}
