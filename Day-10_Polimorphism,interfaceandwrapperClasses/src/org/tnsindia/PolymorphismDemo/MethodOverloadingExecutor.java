package org.tnsindia.PolymorphismDemo;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOverloadingExample m =new MethodOverloadingExample();
		
		//method calling
		m.addition(12,30);
		m.addition(12,90,98);
		
		MethodOverloading m1 =new MethodOverloading();
		m1.addition(12,30);
		m1.addition(12.98f,78);


		
	}

}
