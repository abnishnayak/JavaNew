package coding_q;

import java.util.Scanner;

public class TalingZeroes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check tailing zero");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		int d=0;
		int count=0;
		while(fact!=0) {
			d=fact%10;
			if(d!=0) {
				break;
			}
			count++;
			fact/=10;
		}
		System.out.println("Tailing zero: "+count);
		s.close();
	}

}
