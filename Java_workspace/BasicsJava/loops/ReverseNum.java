package loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int rev=0,d=0;
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		System.out.println("Reverse of the provided number= "+rev);
		s.close();
	}
}