package com.abnishn.Assignment;

import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x: ");
		int x=s.nextInt();
		System.out.println("Enter n: ");
		int n=s.nextInt();
		int result=1;
		for(int i=0;i<n;i++) {
			result=result*x;
		}
		System.out.println("x to the power n is: "+result);
		s.close();
	}

}
