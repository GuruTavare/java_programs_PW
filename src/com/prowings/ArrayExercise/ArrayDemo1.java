package com.prowings.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] res = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter five values: ");

		for (int i = 0; i < res.length; i++) {
			res[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(res));

		Arrays.sort(res);
		System.out.println(" After sorting >>>>>>>>>: " + Arrays.toString(res));
		int count = 0;
		int demo[] = new int[res.length];
		for (int i = res.length - 1; i >= 0; i--) {
			demo[count++] = res[i];

		}
		System.out.println(" After sorting discending >>>>>>>>>: " + Arrays.toString(demo));
		int num = 50;
		int inx = Arrays.binarySearch(res, num);
		System.out.println(num + " present at index : " + inx);

		sc.close();
	}

}
