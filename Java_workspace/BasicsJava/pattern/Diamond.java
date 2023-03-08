package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int space=size-1;
		for(i=1;i<=size;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j = 1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(i=1;i<=size-1;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(size-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}