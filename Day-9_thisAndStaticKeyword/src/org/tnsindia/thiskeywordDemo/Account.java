package org.tnsindia.thiskeywordDemo;

public class Account {
	private long account_no;
	private String  account_type;
	
	public void accept(int account_no,String account_type)
	{
		account_no=account_no;
		account_type=account_type;
	}
	public void display()
	{
		System.out.println("Accont no:"+account_no+""+"Account Type:"+account_type);
	}

	

}
