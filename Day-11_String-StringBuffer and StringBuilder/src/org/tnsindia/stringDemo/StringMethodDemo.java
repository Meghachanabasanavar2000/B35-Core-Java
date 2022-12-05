package org.tnsindia.stringDemo;

import java.util.Scanner;

public class StringMethodDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		
		System.out.println(str1+str2);
		System.out.println(50+50+"error"+50+50);

		System.out.println(str1.concat(str2));
		
		System.out.println("Enter the length of the str1 is:"+(str1).length());
		System.out.println("Enter the length of the str1 is:"+str1.indexOf('w'));
		System.out.println("Enter the length of the str1 is:"+str1.charAt(3));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
}

}
