package method;

public class Test8 {
	int i;
	int j;
	public static void main(String[] args) {
		System.out.println("execution starts");
		Test8 t1=new Test8();
		t1.i=10;
		t1.j=20;
		System.out.println(t1.i);
		System.out.println(t1.j);
		Test8 t2=new Test8();
		t2.i=30;
		t2.j=40;
		System.out.println(t2.i);
		System.out.println(t2.j);
	}
}