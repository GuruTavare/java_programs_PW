package com.prowings.collection.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		// FileInputStream fis = new FileInputStream("abc.properties");

//		 String s ="D:\\Java_Programs2\\Java_Programs\\src\\com\\prowings\\map\\properties";

		// String fis =
		// Thread.currentThread().getContextClassLoader().getResource("abc.properties").getFile();
		String fis = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "abc.properties";

		p.load(new FileInputStream(fis));
		System.out.println(p);
		p.setProperty("user", "Guruprasad");

		// FileOutputStream fos = new FileOutputStream(fis);
		FileWriter fos = new FileWriter(fis);
		p.store(fos, "Updated by Guruprasad");

		System.out.println(p);

	}

}