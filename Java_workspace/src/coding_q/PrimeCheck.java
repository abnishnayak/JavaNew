package coding_q;

import java.util.*;
public class PrimeCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number(except 1&0) to check prime");
		int n=s.nextInt();
		if(primeCheck(n)) {
			System.out.println(n+" is a prime number.");
		}
		else {
			System.out.println(n+" is a composite number.");
		}
		s.close();
	}
	public static boolean primeCheck(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
}