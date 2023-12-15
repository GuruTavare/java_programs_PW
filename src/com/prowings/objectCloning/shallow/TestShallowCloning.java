package com.prowings.objectCloning.shallow;

/**
 * Shallow cloning creates a new object, but it does not create copies of the
 * objects referenced by the original object. 
 * Instead, it copies the references to those objects. 
 * As a result, changes made to the objects referred to by the
 * original object will be reflected in the cloned object, and vice versa
 */
public class TestShallowCloning implements Cloneable {

	public static void main(String[] args) {

		Address address = new Address(1234, "Pune", "India");

		Employee emp1 = new Employee(10, "Ram", address);

		System.out.println(emp1);
		Employee emp2 = null;
		try {
			emp2 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Before changing ");
		System.out.println(emp1);
		System.out.println(emp2);

		System.out.println("After changing ");
		emp1.getAddress().setPin(567);
		emp1.getAddress().setCity("mumbai");
		System.out.println(emp1);
		System.out.println(emp2); 

	}

}
