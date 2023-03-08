package oops.ctt;

public class B {

	public static void main(String[] args) {
		Test3 t=new Test3(); //default constructor executed.
		t.test3();
	}

}
class Test3{
	void test3() {
		System.out.println("method executed.");
	}
}