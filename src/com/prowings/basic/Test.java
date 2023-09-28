package com.prowings.basic;

public class Test {
	public static void main(String[] args) {
		
		double start = System.nanoTime();
		System.out.println("guruprasad");
		Test t =new Test();
		double d =t.square(2);
		System.out.println(d);
		double duration = (System.nanoTime()-start)/1000000;
		System.out.println(duration/1000000+" s");
	}

	/**
	 * this method is used to find the square of given input number and return square. 
	 * @param i
	 * @return int value
	 */
	public double square(int i) {
		return  Math.pow(i, i);
	}

	public Test() {
		super();
		Integer i = 10;
		
		float l = i;
	System.out.println(l);
	}
	
}


