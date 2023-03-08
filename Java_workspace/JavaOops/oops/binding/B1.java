package oops.binding;

public class B1 {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a=new C();
		a.m1();
	}
}
class A{
	void m1() {
		System.out.println("m1 in A");
	}
}
class B extends A{
	void m1() {
		System.out.println("m1 in B");
	}
}
class C extends A{
	void m1() {
		System.out.println("m1 in C");
	}
}