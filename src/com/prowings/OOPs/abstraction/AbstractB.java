package com.prowings.OOPs.abstraction;

public abstract class AbstractB implements InterfaceA,InterfaceA1 {

	@Override
	public void printHi() {

		System.out.println("Hi");
	}

	@Override
	public void printHello() {
		System.out.println("Hello");
	}

//	public abstract void printHiHello();
}