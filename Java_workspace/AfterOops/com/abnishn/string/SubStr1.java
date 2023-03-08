package com.abnishn.string;

import java.util.*;

public class SubStr1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.nextLine();
		String[] sentences=str.split("\\.");
		System.out.println(Arrays.toString(sentences));
		s.close();
	}

}
