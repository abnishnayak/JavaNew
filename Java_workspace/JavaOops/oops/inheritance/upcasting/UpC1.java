package oops.inheritance.upcasting;

public class UpC1 {

	public static void main(String[] args) {
		A a=new A();
		a=new B();
		a=new C();
		System.out.println(a.toString());
		
	}
}
class A{}
class B extends A{}
class C extends A{}