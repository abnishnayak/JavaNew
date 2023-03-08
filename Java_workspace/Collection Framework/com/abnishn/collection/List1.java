package com.abnishn.collection;

import java.util.*;

public class List1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(1,20);
		l.add(null);
		l.add(null);
		l.add(4,40);
		System.out.println(l);
		System.out.println("------------------------");
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
