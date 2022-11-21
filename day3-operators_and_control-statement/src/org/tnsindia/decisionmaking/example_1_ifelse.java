package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class example_1_ifelse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater");
			
		}
		else
		{
			System.out.println("B is greater");
		}
		
	}

}
