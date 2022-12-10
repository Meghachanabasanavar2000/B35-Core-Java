package org.tnsindia.exceptionDemo;

import java.util.Scanner;

public class ThrowKeywordDemo {

	public static void print(int age,int weight) throws Exception
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			throw new Exception ("not Eligible to donate the blood");
		}

	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		try
		{
			print(age,weight);
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}