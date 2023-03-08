package method;

public class Test2 {
	public static void main(String[] args) {
		m1(10);
		m1(10L);
		long n=10;
		m1(n);
	}
	static void m1(int i) {
		System.out.println("m1(int)");
	}
	static void m1(long l) {
		System.out.println("m1(long)");
	}

}
