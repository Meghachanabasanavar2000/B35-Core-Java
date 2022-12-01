package org.tnsindia.thiskeywordDemo;

public class Executor {
	public static void main(String args[]) {
		Account a=new Account();
		a.accept(22245, "Saving Account");
		a.display();
		
		Flower f=new Flower();
		f.setName("Lotus");
		System.out.println("Flower is:"+f.getName());
		
		Vehicle v=new Vehicle();
		v.speed=45;
		v.display2();
		
		
		/*Food f1=new Food();
		f1.display();
		
		Color c=new color();*/
		
		

	}

}
