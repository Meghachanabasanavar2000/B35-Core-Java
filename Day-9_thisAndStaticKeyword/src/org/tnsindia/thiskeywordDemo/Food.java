package org.tnsindia.thiskeywordDemo;

public class Food {
	public String Food_type;
	public String Food_name;
	
	Food()
	{
		Food_type="Chinese";
		Food_name="Hakka Noodles";
	}
	Food get1()
	{
		System.out.println("Food_type is:"+Food_type+""+"Food name is:"+Food_name);
		return this;
	}
}
		/*public void display() 
		{
			System.out.println("")
		}
		}*/


