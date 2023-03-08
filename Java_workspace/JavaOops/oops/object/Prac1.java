package oops.object;

public class Prac1 {

	public static void main(String[] args) {
		A a=new A(84);
		A a1=new A(45);
		
		m1(a);
		m1(a1);
	}
	static void m1(A arg) {
		System.out.println("m1() starts");
		System.out.println(arg.i);
		System.out.println("m1() ends");
	}
}
class A{
	int i;
	A(int i){
		this.i=i;
	}
}