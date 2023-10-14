package com.prowings.OOPs.abstraction;

public class C extends AbstractB {

	public static void main(String[] args) {
		C obj = new C();

		obj.printHi();
		obj.printHello();
		obj.printHiHello();
		System.out.println("addition is :" + obj.addition(10, 20));

		System.out.println("addition is :" + obj.substraction(20, 10));

	}

	@Override
	public void printHiHello() {
		System.out.println("print hi");
		System.out.println("print hello");
	}

	@Override
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substraction(int num1, int num2) {
		return num1 - num2;
	}

}
