package org.tnsindia.InterfaceDemo;

import java.util.Scanner;

public class Shape implements Area{

	@Override
	public void rectangle() {
		Scanner s=new Scanner(System.in);
		System.out.println("The enter the breadth and length:");
		int length=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("The rectangle is"+(breadth*length));
		//s.close();
	
	}

	@Override
	public void circle() {
		Scanner s1=new Scanner(System.in);
		System.out.println("The enter the radius:");
		int radius=s1.nextInt();
		System.out.println("The circle is"+(3.142*radius*radius));
		s1.close();
		
		
	}


	
	

}
