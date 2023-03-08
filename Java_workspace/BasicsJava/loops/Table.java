package loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find its multiplication table");
		int n=s.nextInt();
		for (int i=1;i<=10;i++) {
			int r=n*i;
			System.out.println(n+" x "+i+" = "+r);
		}
		s.close();
	}
}