package org.tnsindia.CollectionDemo;

import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		List<Character>obj=new ArrayList<>(3);
		obj.add('N');
		obj.add('S');
		obj.add('K');
		obj.add('E');
		obj.add('E');
		obj.add('S');
		List<Character>obj1=new ArrayList<>(3);
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj1.contains('O'));
		
		System.out.println("The collection of elements are:"+obj);
		//size of the list
		System.out.println("The total elements are:"+obj.size());
		System.out.println("The index of elements are:"+obj.indexOf('S'));
		System.out.println("The last index of elements are:"+obj.lastIndexOf('S'));
		System.out.println("The index of elements are:"+obj.get(2));









	}

}
