package oops.binding;

public class B3 {

	public static void main(String[] args) {
		E.m1();// early binding
	}
}
class D{
	static void m1() {
		System.out.println("static m1 in D");
	}
}
class E extends D{
	static void m1() {
		System.out.println("static m1 in E");
	}
}