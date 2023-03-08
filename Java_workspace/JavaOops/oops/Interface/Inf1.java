package oops.Interface;

public class Inf1 {

	public static void main(String[] args) {
		I ref;
		ref=new A();
		ref.m1();
		ref=new B();
		ref.m1();
	}
}
interface I {
	void m1();
}
class A implements I{
	public void m1() {
		System.out.println("m1 in A");
	}
}
class B implements I{
	public void m1() {
		System.out.println("m1 in B");
	}
}