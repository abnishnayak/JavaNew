package com.abnishn.Assignment;

import java.util.Scanner;

public class OddNumberSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an odd number: ");
		int n=s.nextInt();
		printSum(n);
		
		
		s.close();
	}
	
	public static void printSum(int n) {
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}

		System.out.println(sum);
	}
}
