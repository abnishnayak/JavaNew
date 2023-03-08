package oops.inheritance.ctt_chaining;

public class Cc {

	public static void main(String[] args) {
		new E();
	}
}
class C{
	C(){
	System.out.println("ctt in C");
	}
}
class D extends C{
	D(){
		System.out.println("ctt in D");
	}
}
class E extends D{
	E(){
		System.out.println("ctt in E");
	}
}