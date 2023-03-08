package oops.inheritance.ctt_chaining;

public class Test {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}
}
class A{
	int i;
	A(){
		System.out.println("ctt in A");
		i=10;
	}
}
class B extends A{
	int j;
	B(){
		super();
		System.out.println("ctt in B");
		j=20;
	}
}