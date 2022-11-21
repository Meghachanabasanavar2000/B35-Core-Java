package org.tnsindia.operators;

import java.util.Scanner;

public class assignmentOperatorDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		a*=b;
		System.out.println("The value is:"+a);

		

	}
}
