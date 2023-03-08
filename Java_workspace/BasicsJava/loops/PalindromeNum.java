package loops;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check palindrome number");
		int n=s.nextInt();
		int temp=n,rev=0,d=0;
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==temp) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
		s.close();
	}
}