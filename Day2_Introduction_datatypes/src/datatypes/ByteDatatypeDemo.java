package datatypes;

public class ByteDatatypeDemo {
	public static void main(String[] args) {
		//byte xyz=128 is not valid as it out of range of byte data-type
		int xyz=129;
		System.out.println("The value is:"+xyz);
		
		long _abc=2147483648L;
		System.out.println("The value is:"+_abc);
		char num='z';
		String str="megha";
		double d=41.9;
		float c=15.67f;
		boolean var=true;
		int x=(int)12.8;
		System.out.println("The value is:"+d);
		System.out.println("The value is:"+str);
		System.out.println("The value is:"+c);
		System.out.println("The value is:"+num);
		System.out.println("The value is:"+var);
		System.out.println("The value is:"+x);

}
}