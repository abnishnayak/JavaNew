package oops.inheritance;

public class Demo5 {

	public static void main(String[] args) {
	L l=new L();
	l.display();
	}

}
class K{
	int k=50;
	public void m1() {
		System.out.println("m1 method in K.");
	}
}
class L extends K{
	int l=18;
	public void display() {
		System.out.println(l);
		System.out.println(super.k);
		super.m1();
	}
}