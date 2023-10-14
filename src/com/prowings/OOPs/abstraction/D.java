package com.prowings.OOPs.abstraction;

public class D extends AbstractB {
	public static void main(String[] args) {
		D obj1 = new D();

		obj1.printHi();
		obj1.printHello();
		obj1.printHiHello();
		System.out.println("addition is :" + obj1.addition(50, 20));

		System.out.println("addition is :" + obj1.substraction(30, 10));
	}

	@Override
	public void printHiHello() {

		System.out.println("jay Shri ram!!");
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
