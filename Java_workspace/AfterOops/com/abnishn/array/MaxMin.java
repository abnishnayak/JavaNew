package com.abnishn.array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Largest number is: "+max);
		System.out.println("Smallest number is: "+min);
		
		s.close();
	}

}
