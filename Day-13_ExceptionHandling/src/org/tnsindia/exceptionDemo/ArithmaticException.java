package org.tnsindia.exceptionDemo;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=14;
		System.out.println("Enter the value of y:");
	    int y=sc.nextInt();
		//try block contains the Exception code
		try
		{
		    int result=x/y;
			System.out.println(result);

		}
		//catch block handled the exception try by try block
		catch(ArithmeticException e)
		{
		System.out.println("Exception Handled "+e);
		}

	}

}
