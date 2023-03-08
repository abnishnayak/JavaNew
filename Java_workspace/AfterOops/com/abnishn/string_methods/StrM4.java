package com.abnishn.string_methods;

public class StrM4 {

	public static void main(String[] args) {
		
		String s1="Abnish";
		String s2=s1.intern();
		System.out.println(s2);
		System.out.println(s1);
		
		System.out.println("-------------");
		
		String s="demo";
		String repStr=s.replace("d", "m");
		System.out.println(repStr);
		
		System.out.println("-------------");
		
		int a=5;
		String v=String.valueOf(a);
		System.out.println(v+10);
	}

}
