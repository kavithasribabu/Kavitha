package com.asminds.corejava.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {
	public static void main(String[] args) throws PinnoException,ArithmeticException {
		Scanner s=new Scanner(System.in);
		int pinnofixed=1234;
		System.out.println("enter the pinno");
		int pinno=s.nextInt();
		if(pinnofixed!=pinno) {
			throw new PinnoException("InvalidPinno");
		}else {			System.out.println("Valid Pin no..");
		}
	}
}
