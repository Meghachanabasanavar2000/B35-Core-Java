package org.tnsindia.CollectionDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("Megha");
		obj.push("Mithila");
		obj.push("Jyoti");
		obj.push("Keerti");
		System.out.println(obj);
		//remove
		obj.pop();
		System.out.println(obj);	

	}

}
