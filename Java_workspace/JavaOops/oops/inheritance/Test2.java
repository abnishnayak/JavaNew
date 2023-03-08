package oops.inheritance;

public class Test2 {

	public static void main(String[] args) {
		Na.m1();
	}
}
class An{
	static void m1() {
		System.out.println("static m1 in An.");
	}
}
class Na extends An{
	static void m1() {
		System.out.println("Static m1 in Na");
		//An.m1();
	}
}