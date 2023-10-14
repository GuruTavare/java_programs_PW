package com.prowings.loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQube {
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		try(Scanner scanner = new Scanner(System.in)) { 
		System.out.println("enter the values: ");
		int i;
		for (i = 0; i <= 4; i++) {
			a[i] = scanner.nextInt();
		}
//		System.out.println("Qube of every elemnt in array is: ");
//		for (i = 0; i <= 4; i++) {
//			int qube = a[i] * a[i] * a[i];
//			System.out.println(qube);
//		}

		for (i = 0; i <= 4; i++) {
			b[i] = a[i] * a[i] * a[i];
		}
		
		System.out.println("elments in array with qube are: " + Arrays.toString(b));

		scanner.close();
		}
	}

}
