package org.tnsindia.lambdaExpDemo;

public class RunnableInterfaceDemoUsingLambda {

	public static void main(String[] args) {
		/*Runnable interface is a functional interface which exactly contains and one 
		abstract method is run*/
		Runnable obj=()->
		{
			//implementing run() method
			System.out.println("Implementing runnble interface");
		};
		obj.run();

	}

}
