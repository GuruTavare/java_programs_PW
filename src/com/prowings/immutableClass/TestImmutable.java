package com.prowings.immutableClass;

public class TestImmutable {

	public static void main(String[] args) {
		
		Address address = new Address(123, "Pune", "India");
		
		ImmutableStudent s = new ImmutableStudent(10, "Ram", address);
		

				
				System.out.println("Before modification : "+ s);
				
//				addr.setCity("Mumbai");
				
				s.getAddress().setCity("Mumbai");
						
				System.out.println("After modification : "+ s);
				
		
		
	}

}
