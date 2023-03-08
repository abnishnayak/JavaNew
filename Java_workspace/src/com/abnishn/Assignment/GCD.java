package com.abnishn.Assignment;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two postive number: ");
		int a=s.nextInt(),b=s.nextInt();
		
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		System.out.println("GCD is: "+b);
		s.close();	
	}
}