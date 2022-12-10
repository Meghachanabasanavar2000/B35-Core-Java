package org.tnsindia.ArrayDemo;

import java.util.Scanner;

public class StudentArrayExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x;
		String y;
		Student[] arr1=new Student[3];
		arr1[0]=new Student(s.nextInt(),s.nextLine());
		arr1[1]=new Student(s.nextInt(),s.nextLine());
		arr1[2]=new Student(s.nextInt(),s.nextLine());



		System.out.println("The elements are");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i].getRoll_no()+","+arr1[i].getName()+"");


		
	}

	}
}
