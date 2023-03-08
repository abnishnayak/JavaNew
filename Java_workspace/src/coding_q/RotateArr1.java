package coding_q;

public class RotateArr1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int d[]= {1,2,3};
		for(int a=0;a<d.length;a++) {
			for(int b=1;b<=d[a];b++) {
				int l=arr[0];
				for(int i=0;i<n-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[n-1]=l;
			}
			for(int j=0;j<n;j++) {
				System.out.print(arr[j]+" ");
			}
		}
	}
}
