package oops.Abstract;

public class Abs1 {

	public static void main(String[] args) {
		A b=new B();
		b.m1();
		System.out.println("----------------");
		b=new C();
		b.m1();
	}
}
abstract class A{
	abstract void m1();
}
class B extends A{
	void m1() {
		System.out.println("m1 in B");
	}
}
class C extends B{
	void m1() {
		System.out.println("m1 in C");
	}
}