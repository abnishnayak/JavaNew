package oops.downcasting;


public class Dc1 {

	public static void main(String[] args) {
		new B();
	}

}
class A{
	static {
		System.out.println("static block in Demo1");
	}
	{
		System.out.println("non-static block in Demo1");
	}
	A(){
		System.out.println("constructor in Demo1");
	}
}
class B extends A{
	static {
		System.out.println("static block in Demo2");
	}
	{
		System.out.println("non-static block in Demo2");
	}
	B(){
		System.out.println("constructor in Demo2");
	}
}