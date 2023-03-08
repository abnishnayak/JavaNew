package oops.blocks;

public class Test {
	static {
		System.out.println("static block in Test.");
	}

	public static void main(String[] args) {
		System.out.println("Main method.");
		A.m1();
		A.m1();
	}
	static {
		System.out.println("2nd static block in test.");
	}
}
class A{
	static {
		System.out.println("static block in A.");
	}
	static void m1() {
		System.out.println("m1 in A.");
	}
}