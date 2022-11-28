package org.tnsindia.abstractionDemo;

public class Employee extends Person{
	private int ID;
	public Employee(String name,String gender,int ID) {
		super(name,gender);
		this.ID=ID;
		
	}	
	@Override
	public void work() {
		if(ID>0)

		{
				System.out.println("Employee Exist");}
			else
			{
				System.out.println("NOT Exist");

			}
			
		}
		
	}

