package com.abnishn.Assignment;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double radius=s.nextDouble();
		
		double circumference=2*3.14*radius;
		System.out.println("The circumference of the circle is : "+circumference);
		
		s.close();
	}

}
