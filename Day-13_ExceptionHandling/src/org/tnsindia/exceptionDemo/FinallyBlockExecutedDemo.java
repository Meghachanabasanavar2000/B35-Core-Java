package org.tnsindia.exceptionDemo;

public class FinallyBlockExecutedDemo {

	public static void main(String[] args) {
		try
		{
			int x=56,y=6;
			System.out.println("Inside try and catch"+x/y);
			//when u called below line and your try block does not contain 
			System.exit(0);

		}
		catch(ArithmeticException e)
		{
			System.out.println("exeception handled"+e);

		}
		finally
		{
			System.out.println("finally always executed");

		}

	}

}
