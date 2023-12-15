package com.prowings.objectCloning.deep;

/**
 * Deep cloning creates a new object and also creates copies of all the objects
 * referenced by the original object. This ensures that changes made to the
 * objects referred to by the original object do not affect the cloned object,
 * and vice versa.
  */
public class TestDeepCloning implements Cloneable{

	public static void main(String[] args) {
		
		Car car = new Car("TATA");
		
		Student s1 = new Student(10, "Ram",car);
		
		System.out.println(s1);
		Student s2 = null;
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Before changing ");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("After changing ");
		s2.setName("Sham");
		s2.getCar().setName("Mahindra");
		System.out.println(s1);
		System.out.println(s2);
	}

}
