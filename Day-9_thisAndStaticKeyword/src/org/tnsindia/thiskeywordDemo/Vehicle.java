package org.tnsindia.thiskeywordDemo;

public class Vehicle {
	public int speed;
	public void display1(Vehicle v)
	{
		System.out.println("Speed is:"+speed+"km/hr");
		
	}
	
	public void display2()
	{
		display1(this);
		
	}
	
	

}
