package org.tnsindia.finalkeyword;

public class FinalMethodWithChild extends FinalMethodwithParent {
	public String PAN_no;
	public void print()
	{
		System.out.println("PAN No is:"+PAN_no);
		super.print();
	}
	
	/*public void print(String PAN_no)
	{
		System.out.println("PAN No is:"+PAN_no);
	}

	final void print()
	{
		System.out.println("Adhar No is:"+PAN_no);
	}*/

}
