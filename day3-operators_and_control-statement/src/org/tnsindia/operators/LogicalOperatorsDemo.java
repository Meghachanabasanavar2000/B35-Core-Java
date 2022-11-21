package org.tnsindia.operators;

import java.util.Scanner;

public class LogicalOperatorsDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of age and weight:");
		int age=s.nextInt();
		int weight=s.nextInt();
		boolean result1=(age>18)&&(weight>50);
		boolean result2=(3==5)||(53>50);
		boolean result3=!(age==weight);
		
		System.out.println("The result is:"+result1);
		System.out.println("The result is:"+result2);
		System.out.println("The result is:"+result3);



		
	
	}
}
