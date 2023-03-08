package com.abnishn.Assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers to find their average: ");
		int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
		
		int average=(a+b+c)/3;
		System.out.println(average);
		s.close();
	}

}
