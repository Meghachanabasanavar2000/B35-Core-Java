package org.tnsindia.ContructorDemo;

public class Employee {
	
	public int salary;
	public String name;
	
	Employee()
	{
		System.out.println("Default constructor");
	}
	public Employee(int salary, String name) {
		//super();
		this.salary = salary;
		this.name = name;
	}
	public void print()
	{
		System.out.println("The salary of "+name+" is "+salary);

	}
	

	

	}


