package com.prowings.collection.map;

import java.util.EnumMap;

enum Weekday {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapDemo {
	public static void main(String[] args) {

		EnumMap<Weekday, String> schedule = new EnumMap<Weekday, String>(Weekday.class);

		schedule.put(Weekday.MONDAY, "meeting");
		schedule.put(Weekday.WEDNESDAY, "Gym");
		schedule.put(Weekday.FRIDAY, "Shopping");

		System.out.println("Wednesday schedule is : " + schedule.get(Weekday.WEDNESDAY));

		for (EnumMap.Entry<Weekday, String> entry : schedule.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
