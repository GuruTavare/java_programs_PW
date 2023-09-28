package com.prowings.basic;

import java.util.Scanner;

public class Triangle {
	static double calculateTriangleArea(int base,int height){
		return 0.5*base*height;
	}
	
	public static void main(String[] args){
		System.out.println("Enter Base & Height of Triangle: ");
		
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("Area of Triangle is: "+calculateTriangleArea(base,height));
		sc.close();
	}
}
