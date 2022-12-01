package org.tnsindia.superkeywordDemo;

public class Leopard extends Animal {
	public String name="Leopard";
	public void accept()
	{
		System.out.println("child class with "+name);
		System.out.println(super.name);
	}

}
