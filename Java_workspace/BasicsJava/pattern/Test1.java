package pattern;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size only in odd numbers");
		int a=s.nextInt();
		Diamond2 d=new Diamond2();
		d.display(a);
		s.close();
	}
}
