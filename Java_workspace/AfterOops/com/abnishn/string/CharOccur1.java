package com.abnishn.string;

import java.util.Scanner;

public class CharOccur1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.nextLine();
		System.out.println("Enter character to check occurence: ");
		char ch=s.next().charAt(0);
		int count=str.length()-str.replace(ch+"","").length();
		System.out.println(ch+" occur "+count+" times.");
		s.close();
	}

}
