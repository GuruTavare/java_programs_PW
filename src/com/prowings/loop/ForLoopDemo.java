package com.prowings.loop;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {
			System.out.println("    hey   ");

			for (int j = 0; j <= 2; j++) {
				System.out.println("j ");

				for (int k = 0; k <= 2; k++) {
					System.out.println("    k ");
				}

			}
		}

	}
}