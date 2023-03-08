package com.abnishn.string;

import java.util.Scanner;

public class CharOccur {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.nextLine();
		System.out.println("Enter character to check occurence: ");
		char ch=s.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch+" occur "+count+" times");
		s.close();
	}

}
