package com.prowings.OOPs.inheritance.multiple;

/* We can achieve some extent of multiple inheritance in java through "interface". 
 * Multiple inheritance can be achieved by:
 *  1.Method signature should be same(return type also).
 *  2.Method signature same and arguments also same
 *  3.But Method signature same and arguments also same and return type different 
 *  then multiple inheritance will not work in  case of interface.
 * but in other cases java language does not support multiple inheritance.
 * 
 */

public class TestInterfaceA1A2 {

	public static void main(String[] args) {
//		Here A1 is interface and A2 is normal class
//		A1 a = new A1(); // invalid A1 is interface can not be instantiated.

//		A1 a1 = new A2(); // parent A1 can hold child A2
//		A2 a3 = new A2();
//		A2 a4 = new A1();			// child can not hold parent object
//		A2 a5=(A2)a1;
	}

}
