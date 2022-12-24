package org.tnsindia.threadsDemo;

class ThreadA extends Thread
{
	public void run()
	{
		int i;
		System.out.println("Thread A");
			for (i=0;i<5;i++)
			{
				try 
				{
					Thread.sleep(2000);
					System.out.println("Squares of the num:"+(i*i));

				} catch (InterruptedException e) {
					System.out.println("Exception Handled");
				}
	}
}
}

	class ThreadB extends Thread
	{
		public void run()
		{
			int i;
			System.out.println("Thread B");
				for (i=0;i<5;i++)
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

public class ThreadLifeCycleDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new ThreadA();
		Thread t2=new ThreadB();
		
		t1.start();
		t1.yield();
		t1.sleep(2000);
	}

}


