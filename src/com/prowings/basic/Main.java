package com.prowings.basic;

public class Main {
	public static void main(String[] args) {
		System.out.println("main started");
		
		  int x = 3; int y = 19;
		 

		extracted(x, y);
	
	
		
	System.out.println("main ended");
		if (x>y) {
			System.out.println("(x>y)=t");
		}else {
			System.out.println("(x>y)=f");
		}
	}

	private static void extracted(int x, int y) {
		double z = Math.max(x, y);
		System.out.println(z);
	}
	

}