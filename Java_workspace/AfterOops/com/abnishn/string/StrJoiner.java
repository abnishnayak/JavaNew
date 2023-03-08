package com.abnishn.string;

import java.util.StringJoiner;

public class StrJoiner {

	public static void main(String[] args) {
		StringJoiner s= new StringJoiner("");
		s.add("hello");
		s.add(" world");
		System.out.println(s);
	}

}
