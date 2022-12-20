package org.tnsindia.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character>obj=new LinkedList<Character>();
		obj.add('N');
		obj.add('S');
		obj.add('K');
		obj.add('E');
		obj.add('E');
		obj.add('S');
		obj.addFirst('M');
		List<Character>obj1=new LinkedList<>();
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj1.contains('O'));

		
		System.out.println("The collection of elements are:"+obj);
		//size of the list
		System.out.println("The total elements are:"+obj.size());
		System.out.println("The index of elements are:"+obj.indexOf('S'));
		System.out.println("The last index of elements are:"+obj.lastIndexOf('S'));
		System.out.println("The index of elements are:"+obj.get(2));
		
		Collections.sort(obj);
		System.out.println("The collection of elements are:"+obj);

		Collections.reverse(obj);
		System.out.println("The collection of elements are:"+obj);


		


	}

}
