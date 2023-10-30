package com.prowings.OOPs.overriding;

/**Overriding=
 * It happens within more than one classes(Should have Is-A relationship i.e Inheritance)
 * Method Signature must be same.(Method name+parameter types).
 * It also called as RunTime polymorphism/ Dynamic binding(As method resolution depend upon runtime object)/ Late binding.
 * AM rule is same or wider access modifier allowed.
 * NAM rule is == "final" method can not be overridden. As its implementation is fixed.
 *             == "static" method can not be overridden. as it resolve at the time of class loading and overriding is Runtime phenomena.
 *             ==Method Hiding--If parent class and child class have Static method with same signature then it is not method overriding but method hiding(in this case method resolution is depend upon class reference.)
 * Return Type Rule== from 1.5 version onwards "Co-varient Return Types "are allowed.(e.g if parent method RT is Object then child method RT can be Object or Childs of objects)
 *              	=Above rule is only for object type not for primitives
 *              	= if primitive DT used then it should same for both parent and child class method.
 * Exception Rule== It is only for a "Checked Exception".i.e if child class method throws a checked exception then it is compulsory to parent class method to throw same checked exception or its Parents.And there is no rule for un-checked exception.             
 * "Method resolution in overriding is depend upon runtime object provided that all the rules of overriding must be satisfied".
 */
public class Parent {
//	public void m1() throws IOException, Exception, Throwable {
//		System.out.println("P method");
//	}
	 public void m1() throws ArithmeticException {
		System.out.println("P method");
	}
}

class Child extends Parent {
	/*
	 * If child class method throws checked exception then it is compulsory to
	 * parent class method to throw same exception or its parents.
	 * 
	 * And there is no restriction on unchecked exception
	 */
//	public void m1() throws IOException {
//		System.out.println("C method");
//	}
	public void m1() throws RuntimeException {
		System.out.println("C method");
	}

}