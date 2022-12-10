package org.tnsindia.exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilenotExceptionDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		//opening a file
		fis=new FileInputStream("C:\\Users\\vijay\\Downloads");
		int k;
		while((k=fis.read())!=-1)
				{
			System.out.println((char)k);
		
				}
		fis.close();

	}

}
