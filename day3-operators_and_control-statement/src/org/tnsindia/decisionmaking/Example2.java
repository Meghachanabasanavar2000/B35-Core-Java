package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a a and b and c");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("A is Greater"+a);
			
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is Greater"+b);
		}
		else
			
		{
			System.out.println("C is Greater"+c);

		}
		
	}

}
