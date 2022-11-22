package org.tnsindia.classdemo;

import java.util.Scanner;

public class ClassAndObjectDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter speed of car");
		int speed=s.nextInt();
		Car obj=new Car();
	    obj.speed(speed);
	    s.close();

	}

}
