package method;

public class Test9 {

	public static void main(String[] args) {
		D.m1();
		D a=new D();
		a.m2();
		D.i=100;
		D.m1();
		a.m2();
	}
}
class D {
	static int i;
	static void m1() {
		System.out.println(i);
	}
	void m2() {
		System.out.println(i);
	}
}