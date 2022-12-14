package org.tnsindia.lambdaExpDemo;

public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		Employee obj=(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is:"+obj.max(45, 67));

	}

}
