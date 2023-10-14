package com.prowings.OOPs.abstraction;

public class TestAb extends TestAbstract {

	public TestAb() {

	}
	public TestAb(String name ,int age ) {
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		TestAb t = new TestAb();
		

		t.m1();
		t.m2();
		
		TestAb t1 = new TestAb("Ram",10);
		System.out.println(t1.age);
		System.out.println(t1.name);
		
		
		//TestAbstract t1 =new TestAbstract();
	}

	@Override
	public void m1() {
		System.out.println("inside m1 method");
	}

}
