package com.abnishn.collection;

import java.util.*;

public class Set {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(null);
		s.add(null);
		s.add(20);
		s.add(30);
		System.out.println(s);
		System.out.println("-------------------");
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
