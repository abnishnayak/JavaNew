package com.abnishn.ExceptionHandling;

import java.io.*;

public class Test2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("d:/a.txt");
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("file doesnot exist");
		}
		
	}

}
