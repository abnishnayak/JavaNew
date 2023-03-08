package com.abnishn.string;

import java.util.Scanner;

public class ShiftLetter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String t=s.nextLine();
		String S="";
		System.out.println("Enter the no. of rotation");
		int n=s.nextInt();
		for(int i=1;i<=t.length();i++) {
			int a=i+n;
			a=a%t.length();
			S=S+t.charAt(a);
		}
		System.out.println(S);
		s.close();
	}
}
