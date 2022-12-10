package org.tnsindia.ArrayDemo;

import java.util.Arrays;

public class UsingArrayClass {
	
	//pass the variable argument
	public static void display(int ...a) {
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
	}

	public static void main(String[] args) {
		display(11,22,33,55,78);
		
		

	}

}
