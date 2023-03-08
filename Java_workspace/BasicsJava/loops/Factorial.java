package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int n=s.nextInt();
		int fact=1;
		if(n<17) {
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
			System.out.println("Factorial of the number is "+fact);
		}
		else {
			System.out.println("int cannot provide factorial of this number, try less than 17");
		}
		
		s.close();
	}
}