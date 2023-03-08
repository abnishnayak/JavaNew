package coding_q;

public class MaxDiff {

	public static void main(String[] args) {
		int arr[]=new int[] {2,7,9,5,1,3};
		int n=arr.length;
		int res=maxDiff(arr,n);
		System.out.println("Maximum Difference between adjacent pairs: "+res);
	}
	public static int maxDiff(int arr[], int n) {
		int max_diff=Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			int cur_diff=Math.abs(arr[i]-arr[i-1]);
			max_diff= Math.max(max_diff, cur_diff);
		}
		return max_diff;
	}
}
