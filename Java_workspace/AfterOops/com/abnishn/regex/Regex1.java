package com.abnishn.regex;

import java.util.regex.*;

public class Regex1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		boolean b1=Pattern.compile(".s").matcher("as").matches();
		
		boolean b2=Pattern.matches(".s", "as");
		
		System.out.println(b+" "+b1+" "+b2);
	}

}
