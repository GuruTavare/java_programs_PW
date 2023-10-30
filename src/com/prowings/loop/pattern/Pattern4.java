package com.prowings.loop.pattern;

public class Pattern4 {

	public static void main(String[] args) {

		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j, row = 6;
		// Outer loop work for rows
		for (i = 1; i <=row; i++) {
			// inner loop work for space
			for (j = 2*(row - i); j >= 0; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 1; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}