package oops.Interface;

public class Inf2 {

	public static void main(String[] args) {
		I1 r=new A1();
		r.m1();
		r.m2();
	}
}
interface I1{
	void m1();
	default void m2() {
		System.out.println("m2 in I1");
	}
}
class A1 implements I1{
	public void m1() {
		System.out.println("m1 in A1");
	}
}