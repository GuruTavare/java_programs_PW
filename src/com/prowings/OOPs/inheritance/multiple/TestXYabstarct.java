package com.prowings.OOPs.inheritance.multiple;

public class TestXYabstarct {
	
//	here Y is abstract class and X is normal class
//	Y extends X
	
	
	X a = new X();		// valid
	
//	X a1 = new Y();		// invalid Y is abstract class
	
//	Y b = new Y();		// invalid Y is abstract class
	
//	Y b1 = new X();		// invalid type mismatch we have to perform down casting here

	Y b1 = (Y) new X();	// valid

}
