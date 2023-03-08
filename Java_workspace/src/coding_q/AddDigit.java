package coding_q;

import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any multiple digit number");
		int n=s.nextInt();
		while(n>9) {
			int sum=0;
			int m=n;
			while(m!=0) {
				int d=m%10;
				sum=sum+d;
				m/=10;
			}
			n=sum;
		}
		System.out.println(n+" is the reduced digit.");
		s.close();
	}

}
