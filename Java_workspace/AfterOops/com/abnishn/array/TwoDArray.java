package com.abnishn.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows and columns: ");
		int row=s.nextInt(), col=s.nextInt();
		int arr[][]=new int [row][col];
		
		System.out.println("Enter elements in matrix form: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("------------------------------------");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
