package org.tnsindia.ArrayDemo;

import java.util.Scanner;

public class ArrayUserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+"index:");
			arr[i]=s.nextInt();

		}
		System.out.println("The elements are");


		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		

		}



	}

}
