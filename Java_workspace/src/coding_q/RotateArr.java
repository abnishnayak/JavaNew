package coding_q;

public class RotateArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int d= 2;
		int a=1;
		while(a<=d) {
			int l=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=l;
			a++;
		}
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}
	}
}
