package com.prowings.OOPs.overloading;

 /**
  * In Overloading method name must be same, it should happen within a class.
  * But method should have different arguments /parameters-in following way-
  * 1.No. of parameters
  * 2.Type of parameter
  * 3.Sequence of parameters
  * There is no specific rule for AM,NAM and Return Type.
  * Overloading is also called as Compile-time polymorphism /Static binding/early binding.
  * Execution sequence for over-loading=
  * 1.Priority Order for Primitive types: 
      Same type > Auto Widening > Boxing > Up-casting(Parent Class) > Super Class
 
  * 2.Priority Order for Reference types: 
      Same type > Up-casting(Parent Class) > Super Class > Un-boxing > exact matching primitive after un-boxing > implicit promotion

  * Var-arg Method(Variable Argument method)==
  * Note: Widening of primitive type gets more priority over var-args.e.g test(int ) will call test(long) instead of test(int...i) method. 
  * Boxing gets more priority over var-args = e.g test(byte,byte) will call test(Byte,Byte) instead of test(byte...x) method.

 */
class Parent {
	
	public void m1(int i) {
		System.out.println("int-arg");
	}

	 int m1(long l) {
		System.out.println("long-arg");
		return 0;
	}

//	public void m1(Integer i) {
//		System.out.println("Integer-arg");
//	}
  
//	public void m1(Number n) {
//		System.out.println("Number-arg");
//	}

	public void m1(Object o) {
		System.out.println("Object-arg");
	}

	public void m1() {
		System.out.println("no-arg");
	}
}

public class Test {
public static void main(String[] args) {
	Parent p = new Parent();
	
	Integer i=10;
	
	p.m1(i);
}
}