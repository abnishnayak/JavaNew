package cond_stmt;

import java.util.Scanner;

public class StudySuggestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No. of days left for exam");
		int day=s.nextInt();
		if (day>=30) {
			System.out.println("read one chapter one day");
		}
		else if (day<30 && day>=15) {
			System.out.println("read five chapters per day");
		}
		else if (day<15 && day>=5) {
			System.out.println("read one subject per day");
		}
		else if (day<5 && day>=2) {
			System.out.println("read two subjects per day");
		}
		else {
			System.out.println("visit temple for help");
		}
		s.close();
	}
}