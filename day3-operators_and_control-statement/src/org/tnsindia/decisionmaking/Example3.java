package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a a and b and c");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40&&weight<=120)
			{
				if(weight>120)
				{
					System.out.println("Eligible to donate blood");
					
				}
				else
				{
					System.out.println("Extra roops will be added");

				}
			}
		
		else
			
			{
				System.out.println("Not Eligible for bunjee jumping");

			}
		}
	}

}
