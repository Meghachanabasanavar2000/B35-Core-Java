package org.tnsindia.CollectionDemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		v.add(12);
		v.add(1,56);
		v.add(2,98);
		System.out.println(v);
		
		for(Integer itr:v)
		{
			System.out.println(itr+",");
		}

	}

}
