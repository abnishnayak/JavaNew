package pattern;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		for(int i=1;i<=size;i++) {
			for (int j=1;j<=size;j++) {
			System.out.print(" * ");
		}
		System.out.println();
		}
		s.close();
	}
}