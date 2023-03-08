package oops.downcasting;

public class Dc {

	public static void main(String[] args) {
		C c=new C();
		E e=new F();
		e.m1(c);
	}
}
class C{}
class D extends C{}
class E{
	void m1(C arg) {
		System.out.println("m1(C) in E");
	}
	void m1(D arg) {
		System.out.println("m1(D) in E");
	}

}
class F extends E{
	void m1(C arg) {
		System.out.println("m1(C) in F");
	}
	void m1(D arg) {
		System.out.println("m1(D) in F");
	}
}