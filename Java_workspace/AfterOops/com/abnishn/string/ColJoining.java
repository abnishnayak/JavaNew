package com.abnishn.string;

import java.util.*;
import java.util.stream.Collectors;

public class ColJoining {

	public static void main(String[] args) {
		List<String> liststr=Arrays.asList("abc","def","ghi");
		String s=liststr.stream().collect(Collectors.joining(""));
		System.out.println(s);
	}

}
