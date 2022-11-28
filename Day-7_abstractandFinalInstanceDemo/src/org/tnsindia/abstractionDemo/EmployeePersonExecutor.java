package org.tnsindia.abstractionDemo;

public class EmployeePersonExecutor {

	public static void main(String[] args) {
		Person p1=new Employee("Megha","Female",22);
		Person p2=new Employee("Mithila","Female",-3);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


		}


	}


