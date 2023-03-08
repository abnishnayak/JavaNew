package com.abnishn.string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		String pal="";
		for (int i=str.length()-1;i>=0;i--) {
			pal=pal+str.charAt(i);
		}
		if(pal.equals(str)) {
			System.out.println(pal+" is a palindrome word.");
		}else {
			System.out.println(str+" is not a palindrome word.");
		}
		s.close();
	}

}
