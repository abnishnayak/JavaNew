package oops;

public class A1 {

	public static void main(String[] args) {
		Demo1 obj1=new Demo1();
		obj1.i=90;
		obj1.m2();
	}

}
class Demo1{
	int i;
	void m1() {
		System.out.println(this.i);
	}
	void m2() {
		m1();
	}
}