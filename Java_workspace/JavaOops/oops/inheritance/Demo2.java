package oops.inheritance;

public class Demo2 {

	public static void main(String[] args) {
		E e=new E();
		e.m1();
		System.out.println("----------------");
		F f=new F();
		f.m1();
		f.m2();
		System.out.println("----------------");
		G g=new G();
		g.m1();
		g.m2();
		g.m3();
	}

}
class E{
	void m1() {
		System.out.println("E");
	}
}
class F extends E{
	void m2() {
	System.out.println("F");
	}
}
class G extends F{
	void m3() {
		System.out.println("G");
	}
}