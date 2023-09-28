package com.prowings.basic;

import java.util.Scanner;

public class BoxVolume {
	public static int calculateVolume(int length,int breadth, int height){
		return length*breadth*height;
	}
	
	public static void main(String[] args){
		System.out.println("Enter Length,Breadth,Height of Box: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int height = sc.nextInt();
		
		int volume = calculateVolume(length,breadth,height);
		
		System.out.println("Volume of Box is: "+volume);
		sc.close();
	}

}
