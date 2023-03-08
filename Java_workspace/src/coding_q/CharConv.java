package coding_q;

import java.util.Scanner;

public class CharConv {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string containing small and capital letters.");
		String str=s.nextLine();
		String a="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			} else {
				ch=(char)(ch-32);
			}
			a+=ch;
		}
		System.out.println("changed string: "+a);
		s.close();
	}

}
