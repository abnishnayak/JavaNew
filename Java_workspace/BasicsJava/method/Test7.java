package method;

public class Test7 {
	static int i=10;
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(Test7.i);
		System.out.println(A.j);
		System.out.println("main ends");
	}
}
class A{
	static int j=20;
}