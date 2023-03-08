package com.abnishn.collection;

import java.util.ArrayList;

public class List {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Hello");
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add("a");
		al2.add("bb");
		al2.add("ccc");
		System.out.println(al2);
	}

}
