package org.tnsindia.threadsDemo;
class Parent
{
	public void squareNum() throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("Squares of the num:"+(i*i));
		}
	}
}

class Child
{
	public void squareNum() throws InterruptedException
	{
		for (int i=0;i<55;i++)
		{
			Thread.sleep(2000);
			System.out.println("Squares of the num:"+(i*2));
		}
	}

	public void doubleNum() {
		
	}
}
//In SingleThreading concept,at the single times one process executed

public class SingleThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main method.....");
		Parent p=new Parent();
		Child c=new Child();
		p.squareNum();
	    c.doubleNum();

		

		

	}

}
