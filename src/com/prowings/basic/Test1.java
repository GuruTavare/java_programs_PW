package com.prowings.basic;

public class Test1 {

	int rl;
	String abd;
	String xyz;
	

	public Test1(int rl, String abd, String xyz) {
		super();
		this.rl = rl;
		this.abd = abd;
		this.xyz = xyz;
	}

	public Test1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("good morning");
		int res =getAdditon(10, 20);
		System.out.println("Addition is: "+res);
		System.out.println("good morning");
		
		//Test1 t = new Test1();
		Test t1= new Test();
		double resSq =t1.square(5);
		System.out.println(resSq);
	}

	private static int getAdditon(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	

}
