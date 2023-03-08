package loops;

import java.util.*;

public class Summation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find the summation");
		int n=s.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Summation of the number = "+sum);
		s.close();
	}
}