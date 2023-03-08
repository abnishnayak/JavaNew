package recursion;

public class Test2 {
	public static void main(String[] args) {
		int n=m1(1);
		System.out.println(n);
	}
	static int m1(int a) {
		System.out.println(a);
		if(a>=3) return 1;
		a=m1(a+1);
		System.out.println(a);
		return 2;
	}
}
