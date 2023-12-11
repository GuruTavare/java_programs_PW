package com.prowings.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int res = 10 / 0;
			System.out.println(res);
		} catch (ArithmeticException e) {
			
			throw new NullPointerException();
		}

//		finally {
//			try {
//			} catch (ArithmeticException e2) {
//				System.out.println("inside finally catch");
//			} finally {
//				System.out.println("inside finally finally");
//			}
//
//		}
	}

}
