package basics;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("main() starts");
		Test.m1();
		System.out.println(Test.a);
		System.out.println(Test.b);
		Test t=new Test();
		System.out.println(t.d);
		t.m2();
		System.out.println("main() ends");
	}
}
class Test{
	static int a=50;
	static int b=85;
	double d=56.45;
	public static void m1() {
		System.out.println("m1() starts");
		System.out.println("m1() ends");
	}
	public void m2() {
		System.out.println("m2() starts");
		System.out.println("m2() ends");
	}
}