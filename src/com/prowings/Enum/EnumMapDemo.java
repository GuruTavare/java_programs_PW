package com.prowings.Enum;

import java.util.*;

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE;


}

public class EnumMapDemo {
	public static void main(String[] args) {

		EnumMap<Days, Integer> myMap = new EnumMap<>(Days.class);

		myMap.put(Days.MONDAY, 1);
		myMap.put(Days.THURSDAY, 4);
		myMap.put(Days.SATURDAY, 6);
		
		System.out.println(myMap);

		HashMap<Size, Integer> hm = new HashMap<>();
		hm.put(Size.SMALL, 111);
		hm.put(Size.MEDIUM, 555);
		hm.put(Size.LARGE, 999);

		EnumMap<Size, Integer> myMap1 = new EnumMap<>(hm);
		System.out.println(myMap1);

	}

}
