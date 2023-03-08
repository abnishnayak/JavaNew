package com.abnishn.ExceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("ClassNotFound Exception found");
		}
	}

}
