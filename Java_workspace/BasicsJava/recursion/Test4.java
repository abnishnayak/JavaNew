package recursion;

public class Test4 {

	public static void main(String[] args) {
		m1(1);
	}
	static void m1(int a) {
		System.out.println(a);
		m2(a+1);
		System.out.println(a);
	}
	static void m2(int a) {
		System.out.println(a);
	}
}
