package org.tnsindia.ContructorDemo;

public class ConstructorExecutor {

	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(25000,"Megha");
		Employee e2=new Employee(25000,"Nikita");

		e1.print();
		e2.print();


	}

}
