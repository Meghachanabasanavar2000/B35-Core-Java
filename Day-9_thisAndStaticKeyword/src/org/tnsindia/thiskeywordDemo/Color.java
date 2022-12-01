package org.tnsindia.thiskeywordDemo;

public class Color {
	public String name;
	Color()
	{
		this("Red");
		System.out.println("Default Contructor");

	}
	Color(String name)
	{
		System.out.println("This color is:"+name);
	}
}
