package recursion;

public class Test3 {
	public static void main(String[] args) {
		m1(1);
	}
	static void m1(int a) {
		System.out.println(a);
		if(a>=3) return;
		m1(a+1);
		m1(a+1);
		System.out.println(a);
		return;
	}
}
