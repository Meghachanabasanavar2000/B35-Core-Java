package org.tnsindia.StringBufferDemo;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("megha");
		System.out.println(s.capacity());
		//by default of the capacity
		System.out.println(s.capacity()+"Hello");//capacity 16+length of character
		System.out.println(s.append("chanabasanavar"));
		System.out.println(s.insert(10,"chanabasanavar"));
		s.setCharAt(3,'c');
		System.out.println(s);

		
	
	}

	}

