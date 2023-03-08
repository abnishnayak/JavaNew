package coding_q;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		for (int i=2;i<=n/2; i++) {
			if (n%i==0) {
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
		s.close();
	}

}
