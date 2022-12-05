package org.tnsindia.PolymorphismDemo;

public class Renault {
	
	public String model;
	//Constructor OverLoading
	//default constructor
	Renault()
	{
		System.out.println("Constructor OverLoading");

	}
	
	Renault(String model)
	{
		System.out.println("Model name is:"+model);
	}

}
