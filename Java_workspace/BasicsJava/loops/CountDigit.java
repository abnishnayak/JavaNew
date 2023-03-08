package loops;

import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		System.out.println("No. of digits= "+count);
		s.close();
	}
}