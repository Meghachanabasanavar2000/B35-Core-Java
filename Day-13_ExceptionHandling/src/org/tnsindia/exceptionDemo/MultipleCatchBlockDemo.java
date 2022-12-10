package org.tnsindia.exceptionDemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		//by default it takes 0 as we have not pass any argument to args
		try
		{
		int a=args.length;
		System.out.println("the length of a is:"+a);
		int b=12/a;
		System.out.println(b);
		int arr[]= {34,89,98,78};
		System.out.println(arr[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exeception handled"+e);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exeception handled"+e);

		}
		finally
		{
			System.out.println("finally is always executed");

		}



	}

}
