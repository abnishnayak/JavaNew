package oops.ctt;

public class A {

	public static void main(String[] args) {
		new Test1();
		new Test1();
	}

}
class Test1{
	Test1(){
		System.out.println("executing constructor");
	}
}