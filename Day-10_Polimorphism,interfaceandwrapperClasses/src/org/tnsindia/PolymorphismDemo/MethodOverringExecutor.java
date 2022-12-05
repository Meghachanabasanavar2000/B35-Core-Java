package org.tnsindia.PolymorphismDemo;

public class MethodOverringExecutor {
	public static void main(String[] args) {
	MethodOverringChild m=new MethodOverringChild();
	MethodOverridingExample m1=new MethodOverringChild();

	System.out.println(m.mul(45,89));
	System.out.println(m.mul(67,89));
	

	}
}
