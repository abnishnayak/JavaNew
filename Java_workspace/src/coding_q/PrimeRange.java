package coding_q;

import java.util.*;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter lower range");
		int lr=s.nextInt();
		System.out.println("Enter higher range");
		int hr=s.nextInt();
		for(int i=lr;i<=hr;i++) {
			if(primeCheck(i)) {
				System.out.println(i);
			}
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
		return count==2;
	}
}