package com.prowings.collectionExercise;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWords {

	public static void main(String[] args) {

		String s = "India is my country and I love India very very love much ";

		occuranceOfWords(s);

	}

	public static void occuranceOfWords(String s) {

		String[] str = s.split(" ");

//		List<String> l = Arrays.asList(str);
//		int i = 0;
		// System.out.println(Collections.frequency(l, "india"));
//		for (String c : l) {
////			if (c.equalsIgnoreCase(c)) {
//			System.out.println(c + ":" + Collections.frequency(l, c));
//
//		}

		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String t : str) {

			if (hashMap.containsKey(t))
				hashMap.put(t, hashMap.get(t) + 1);
			else
				hashMap.put(t, 1);

		}
		
		System.out.println(hashMap);
	}
}
