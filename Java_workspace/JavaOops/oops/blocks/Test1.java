package oops.blocks;

public class Test1 {
	public static void main(String[] args) {
		new C();
	}

}
class C{
	{
		System.out.println("non-static block in C");
	}
	C(){
		System.out.println("Constructor in C");
	}
}