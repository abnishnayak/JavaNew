package com.abnishn.array;

import java.util.Scanner;

public class SortedArrayInAscending {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		boolean isAscending=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isAscending=false;
			}
		}
		if(isAscending) {
			System.out.println("Array is sorted in ascending order");
		}else {
			System.out.println("Array is not sorted in ascending order");
		}
		s.close();
	}

}
