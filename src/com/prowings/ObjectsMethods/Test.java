package com.prowings.ObjectsMethods;

import java.util.Objects;

public class Test implements Cloneable{
	int id ;
	String name;
	

	public Test(int xy, String string) {
		this.id=xy;
		this.name=string;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) throws CloneNotSupportedException{
		Test t1 = new Test(10,"Ram");
		
		Test t2 = (Test)t1.clone();
		
	    System.out.println(t1==t2);
	    System.out.println(t1.equals(t2));
	    
	    
	}
}
