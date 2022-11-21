package org.tnsindia.operators;

import java.util.Scanner;

public class relationOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		boolean result=a>=b;
		
		System.out.println("The result is:"+result);

		

	

}
}