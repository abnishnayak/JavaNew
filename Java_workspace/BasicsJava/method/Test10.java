package method;

public class Test10 {

	public static void main(String[] args) {
		E e=new E();
		e.i=10;
		E e1=new E();
		e1.i=20;
		e.m1();
		e1.m1();
	}
}
class E{
	int i;
	void m1() {
		System.out.println(i);
	}
}