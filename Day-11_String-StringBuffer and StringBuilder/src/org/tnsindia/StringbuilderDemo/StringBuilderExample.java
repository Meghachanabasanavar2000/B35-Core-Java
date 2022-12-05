package org.tnsindia.StringbuilderDemo;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("megha");
		System.out.println(s.capacity());
		//by default of the capacity
		System.out.println(s.capacity()+"Hello");//capacity 16+length of character
		System.out.println(s.append("chanabasanavar"));
		System.out.println(s.insert(10,"chanabasanavar"));
		



		

	}

}
