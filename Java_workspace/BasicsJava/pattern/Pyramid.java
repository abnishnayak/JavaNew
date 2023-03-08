package pattern;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int star=1,space=size-1;
		for(int i=1;i<=size;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star+=2;
		}
		s.close();
	}
}
