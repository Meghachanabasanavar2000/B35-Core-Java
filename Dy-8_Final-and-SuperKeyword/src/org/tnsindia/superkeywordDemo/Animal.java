 package org.tnsindia.superkeywordDemo;

public class Animal {
		protected String name="Wild-Animal";
		
		//parent constructor
		Animal()
		{
			System.out.println("Parent constructor");
		}
		
		//method
		public void accept()
		{
			System.out.println("Parent class with "+name);
		}

	}