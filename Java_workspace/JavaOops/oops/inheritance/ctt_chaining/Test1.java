package oops.inheritance.ctt_chaining;

public class Test1 {

	public static void main(String[] args) {
		new L();
		System.out.println("-----------------------");
		new L(10);
	}

}
class K{
	K(){
		System.out.println("K()");
	}
}
class L extends K{
	L(){
		this(10);
		System.out.println("L()");
	}
	L(int n){
		System.out.println("L(int)");
	}
}