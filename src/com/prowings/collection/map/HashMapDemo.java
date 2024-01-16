package com.prowings.collection.map;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo extends Thread {

	static ConcurrentHashMap<String, Integer> h = new ConcurrentHashMap<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println("run method started");
		h.put("pam", 123);
	}

	public static void main(String[] args) throws Exception {

		System.out.println(Thread.currentThread().getName());

		h.put("ram", 123);
		h.put("Sham", 123);

		HashMapDemo t = new HashMapDemo();
		t.start();

		Set s = h.keySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(3000);
			
		}
		System.out.println(h);

	}
}
