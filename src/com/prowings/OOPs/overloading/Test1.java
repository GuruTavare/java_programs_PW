package com.prowings.OOPs.overloading;
class A{
	public void m1(String s) {
		System.out.println("A's m1()");
	}
}
class B extends A{
	public void m1() {
		System.out.println("B's m1()");
	}
}
public class Test1 {
	public static void main(String[] args) {
		A a = new B();
		
		a.m1("hello");
		try {
		System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			e.getMessage();
		}
	}
}
