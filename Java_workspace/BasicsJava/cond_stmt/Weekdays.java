package cond_stmt;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 letters");
		String st=s.next();
		switch(st) {
		case "sun": System.out.println("Sunday"); break;
		case "mon": System.out.println("Monday"); break;
		case "tue": System.out.println("Tuesday"); break;
		case "wed": System.out.println("Wednesday");break;
		case "thu": System.out.println("Thursday"); break;
		case "fri": System.out.println("Friday"); break;
		case "sat": System.out.println("Saturday"); break;
		default: System.out.println("No Match Found"); break;
		}
		s.close();
	}

}
