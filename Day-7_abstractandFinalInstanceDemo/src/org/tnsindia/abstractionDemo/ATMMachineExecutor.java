package org.tnsindia.abstractionDemo;

public class ATMMachineExecutor {

	public static void main(String[] args) {
		ATMMachineChild a=new ATMMachineChild();
		//ATMMachineChild a=new ATMMachineChild();

		a.withdraw();
		a.display();

	}

}
