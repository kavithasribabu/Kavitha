package com.asminds.corejava.abstraction.student;

import java.util.Scanner;

public class StudentTest extends student {
	
	
	@Override
	void grade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade:");
		int s=sc.nextInt();
		 if(s<500 && s>=400)
		 {
			 System.out.println("A grade");
		 }
		 else if(s<400 && s>=300)
		 {
			 System.out.println("B grade");
		 }
		 else
		 {
			 System.out.println("C grade");
		 }
		
	}

	public static void main(String[] args) {
		student a=new StudentTest();
		a.grade();
		a.display();
		
	}

}
