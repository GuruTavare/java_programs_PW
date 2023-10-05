package com.prowings.loop;

public class ForLoopDemo {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 0; i < rows; i++) {
//			System.out.println("\n ");

			for (int j =0 ; j<=i; j++) {
				System.out.print("g ");

			}
			System.out.println();
		}
	}
}
