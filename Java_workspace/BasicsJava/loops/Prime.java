package loops;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number(except 1&0) to check prime");
		int n=s.nextInt();
		int count=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count<2) {
				System.out.println(n+" is neutral");
			}
			else if (count==2) {
				System.out.println(n+" is prime.");
			}
			else {
				System.out.println(n+" is composite");
			}
		s.close();
	}
}
