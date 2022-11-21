package org.tnsindia.operators;

import java.util.Scanner;

public class TernoryOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		int result=(a>b)?a:b;
		System.out.println("The result is:"+result);

		
	}
}
