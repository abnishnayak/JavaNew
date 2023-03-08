package com.abnishn.Assignment;

import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=s.nextInt(), b=s.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater");
		} else {
			System.out.println(b+" is greater");
		}
		s.close();
	}

}
