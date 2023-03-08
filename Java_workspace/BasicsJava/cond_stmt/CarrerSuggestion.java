package cond_stmt;

import java.util.Scanner;
public class CarrerSuggestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your percentage");
		double marks=s.nextDouble();
		if(marks>=90) {
			System.out.println("MBBS recommended");
		}
		else if(marks<90 && marks>=60) {
			System.out.println("Engineering recommended");
		}
		else if(marks<60 && marks>=35) {
			System.out.println("Bachelor's (except Engg.) recommended");
		}
		else if(marks<35) {
			System.out.println("Politics recommended");
		}
		s.close();
	}
}