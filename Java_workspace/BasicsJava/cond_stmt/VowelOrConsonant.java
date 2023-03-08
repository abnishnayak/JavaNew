package cond_stmt;

import java.util.*;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char c=s.next().charAt(0);
		switch(c) {
		case 'a','A':System.out.println("Vowel"); break;
		case 'e','E':System.out.println("Vowel");break;
		case 'i','I':System.out.println("Vowel");break;
		case 'o','O':System.out.println("Vowel");break;
		case 'u','U':System.out.println("Vowel"); break;
		default: System.out.println("Consonant");
		}
		s.close();
	}
}