package org.tnsindia.ArrayDemo;
//Demo on varargs
public class VariableArgument {
	//String ...s is variable argument and its contain o-n values
	public static void print(int a,int b,String ...s)
	{
		System.out.println(a+""+b);
//print varargs
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}

	public static void main(String[] args) {
		//fun calling
		print(12,25,"Java","HTML","CSS");

	}

}
