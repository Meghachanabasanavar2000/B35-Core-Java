package datatypes;

import java.util.Scanner;

public class integeruserinputDemo {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");

		int x=s.nextInt();
		System.out.println("Enter the number:");
		float y=s.nextInt();
		System.out.println("Enter the float:");
		char c=s.next().charAt(0);
		System.out.println("Enter the char:");
		String str=s.nextLine();
		
		
		System.out.println("The Integer is:"+x);
		System.out.println("float is:"+y);
		System.out.println("char is:"+c);
		System.out.println("str is:"+str);
		s.close();
	}

}
