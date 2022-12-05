package org.tnsindia.stringDemo;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		//string literal
		/*String str1="Hello";
		String name=new String("Hello");*/
		
		//new keyword
		//System.out.println(str1);
		//System.out.println(name);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string:");
		
		String str1=s.nextLine();
		System.out.println("Enter the second string:");
		String str2=new String(s.nextLine());
		System.out.println("Enter the third string:");

		String str3=new String(s.nextLine());
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	
		System.out.println(str2.equals(str3));


	}
	

}
