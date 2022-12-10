package org.tnsindia.ArrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr= {22,66,77,77,45};
		System.out.println(arr[4]);
		
		char[] arr1= {'a','b','c','d'};
		System.out.println(arr[2]);
		int arr3[]=new int[4];
	    arr3[0]=56;
	    arr3[1]=57;
	    arr3[2]=578;
	    arr3[3]=56;
	    //enhance for loop
	    for(int itr:arr3)
	    {
			System.out.println(itr);

	    }
	    
	    //to print all the array elements using for loop
	    for(char i=0;i<arr1.length;i++) {
			System.out.println(arr[i]);
	    	
	    }





		

	}

}
