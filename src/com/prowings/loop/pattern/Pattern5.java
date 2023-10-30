package com.prowings.loop.pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int numRows = 5; // Define the number of rows

		// Outer loop for rows
		for (int i = 1; i <= numRows; i++) {
			// Inner loop to print spaces for alignment
			for (int j = 1; j <= numRows - i; j++) {
				System.out.print(" ");
			}

			// Print decreasing sequence
			for (int k = 5; k >= i; k--) {
				System.out.print(k + "  ");
			}

			// Print increasing sequence
			for (int l = 1; l <= i; l++) {
				System.out.print(l + "  ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}
