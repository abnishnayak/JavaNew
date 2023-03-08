package method;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int res=fact(a);
		System.out.println("result= "+res);
		s.close();
	}
	static int fact(int n) {
		if(n==0) return 1;
		return fact(n-1)*n;
	}
}