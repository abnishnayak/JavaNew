package com.abnishn.Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,6,3,1,2};
		
		for(int i=0;i<arr.length;i++) {
			int sm=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[sm]>arr[j]) {
					sm=j;
				}
			}
			int temp=arr[sm];
			arr[sm]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
