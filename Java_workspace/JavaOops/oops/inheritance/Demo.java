package oops.inheritance;

public class Demo {

	public static void main(String[] args) {
		B b=new B();
		b.i=64;
		b.j=68;
		System.out.println(b.i);
		System.out.println(b.j);
	}
}
class A{
	int i;
}
class B extends A{
	int j;
}