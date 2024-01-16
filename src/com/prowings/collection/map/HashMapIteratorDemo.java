package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("AAA", 123);
		hashMap.put("ZZZ", 23);
		hashMap.put("GGG", 654);
		hashMap.put("JJJ", 584);
		hashMap.put("CCC", 456);
		hashMap.put("LLL", 231);

		// 1. Using keySet() and For Each Loop

		for (String key : hashMap.keySet()) {
			Integer value = hashMap.get(key);
			System.out.println(value);
		}

		// 2.Using entrySet() and forEachLoop

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {

			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key + ":" + value);
		}

		// 3. Using Iterator and keySet() and entrySet()

		Iterator<String> keyIterator = hashMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();

			Integer value = hashMap.get(key);

			System.out.println(value + ":" + key);
		}

		Iterator<Map.Entry<String, Integer>> entryIterator = hashMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(">>" + key + ":" + value);
		}

		// 4. Using java 8 Streams

		hashMap.keySet().forEach(key -> {
			Integer value = hashMap.get(key);

			System.out.println(value + "::::" + key);

		});

		hashMap.entrySet().stream().forEach(entry -> {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(">>>>>" + value + ":::" + key + "<<<<<");
		});

	}

}
