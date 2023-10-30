package com.prowings.basic;
import java.util.Scanner;

public class LeapYear2
{
	public static void main(String[] args)
	{
		Scanner SC=new Scanner(System.in);
		int y;
		
		System.out.println("Enter the Year: ");
		y=SC.nextInt();
		
		if(( y%400==0)||(y%100!=0)&&(y%4==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		SC.close();
	}	
}