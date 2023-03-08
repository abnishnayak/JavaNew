package com.abnishn.Assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=s.nextInt();
		int a=0,b=1;
		if(n<48) {
			if(n>1) {
				for(int i=2;i<=n;i++) {
					System.out.print(b+" ");
					int temp=b;
					b=a+b;
					a=temp;
				}
				System.out.println();
			} 
			
		}
		else {
			System.out.println("int datatype cannot handle the operation.");
		}
		s.close();
	}

}
