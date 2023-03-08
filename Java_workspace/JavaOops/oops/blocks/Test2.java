package oops.blocks;

public class Test2 {

	public static void main(String[] args) {
		new D();
		System.out.println("----------------------------");
		new D(46);
	}

}
class D{
	{
		System.out.println("non-static block in D.");
	}
	D(int i){
		System.out.println("parameterized constructor in D");
	}
	D(){
		System.out.println("Default constructor in D.");
	}
}