package com.asminds.corejava.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int value=10/0;
		}catch (ArithmeticException e1) {
			System.out.println(e1);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Hello Welcome");
		}
	}
}
