package com.prowings.basic.switchcase;

import java.util.Scanner;

public class CityInformation {

	public static String cityInfo(int number) {

		switch (number) {
		case 1:

			return "You have selected a city of mumbai.It is Capital city of Maharashtra.";

		case 2:

			return "You have selected a city of Jaipur .It is capital city of Rajasthan.";
		case 3:

			return "You have selected a city of panji.It is capital city of Goa.";
		case 4:

			return "You have selected a city of Hyderabad.It is capital city of Telangana.";
		case 5:

			return "You have selected a city of Bhopal.It is capital city of Madhyapradesh.";

		default:
			return"Invalid Number";
		}

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 5: "+
		"\n1.Mumbai"
		+ "\n2.Jaipur"
		+ "\n3.Panji"
		+ "\n4.Hyderabad"
		+ "\n5.Bhopal");
		
		int number = scanner.nextInt();
		cityInfo(number);
//		String s=cityInfo(number);
//		System.out.println(s);
		
		scanner.close();
	}

}
