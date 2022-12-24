package org.tnsindia.threadsDemo;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		MyRunnable t1=new MyRunnable();
		Thread t=new Thread(t1);
		t.start();
		Thread tt=new Thread(t1);
		tt.start();
	}

}
