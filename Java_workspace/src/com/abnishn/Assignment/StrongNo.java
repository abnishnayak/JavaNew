package com.abnishn.Assignment;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int n=s.nextInt();
		int m=n,d=0,sum=0;
		while(n!=0) {
			d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if (sum==m) {
			System.out.println(m+" is a strong number.");
		} else {
			System.out.println(m+" is  not a strong number.");
		}
		s.close();
	}

}
