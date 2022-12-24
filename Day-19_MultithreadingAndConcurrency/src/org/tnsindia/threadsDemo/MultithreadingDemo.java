package org.tnsindia.threadsDemo;
//Runnable is an functional interface which contains exactly once
class MyThread implements Runnable
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println("Squares of the num:"+(i*i));

			} catch (InterruptedException e) {
				System.out.println("Exception Handled");
			}
		}
	}
}

class AnotherThread extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println("Squares of the num:"+(i*2));

			} catch (InterruptedException e) {
				System.out.println("Exception Handled");
			}
		}
	}
}
//In multiThreading concept,at the multi times multi prpcess executed
public class MultithreadingDemo {
	public static void main(String args[]) {
		MyThread t=new MyThread();
		AnotherThread t1=new AnotherThread();
		//when u call to start method then come into run method
		//t.start(); start() method comes in ter
		t1.start();
		
	}

}
