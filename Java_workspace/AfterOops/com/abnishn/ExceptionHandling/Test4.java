package com.abnishn.ExceptionHandling;

import java.io.*;

public class Test4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("d:/a.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not availiable");
		}
		finally {
			if(fis!=null) {
				fis.close();
			}
			System.out.println("file closed");
		}
	}

}
