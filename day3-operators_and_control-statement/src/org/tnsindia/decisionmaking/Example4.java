package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Megha");
			
		case 'b':
			System.out.println("Hello");
			break;
		case 'c':
			System.out.println("Sonu");
			break;
		default:
			System.out.println("Invalid Input");
			s.close();
		
	
		
		}
	}

}
