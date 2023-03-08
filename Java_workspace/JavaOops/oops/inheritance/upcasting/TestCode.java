package oops.inheritance.upcasting;

public class TestCode {

	public static void main(String[] args) {
		A1 a=new C1();
		a.m1();
		//a.m3(); error
		A1 b=new B1();
		b.m1();
		//b.m2();// error
		// using super class type reference variable, we cannot refer subclass members.
	}
}
class A1{
	void m1() {}
}
class B1 extends A1{
	void m2() {}
}
class C1 extends A1{
	void move() {}
}