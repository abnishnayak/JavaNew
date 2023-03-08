package method;

public class Test3 {
	static void m1(int i, double d) {
		System.out.println("m1(int, double)");
	}
	static void m1(double d, int i) {
		System.out.println("m1(double, int)");
	}

	public static void main(String[] args) {
		m1(10,2.5);
		m1(84.5,65);
		m1(4,5.5);
	}
}
