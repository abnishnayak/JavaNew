package oops.ctt;

public class Test5 {

	public static void main(String[] args) {
		new E(10);
		new E();
		new E(10,5);
		new E('a');

	}

}
class E{
	E(){
		System.out.println("ctt without arg.");
	}
	E(int i){
		System.out.println("ctt with 1 arg.");
	}
	E(int i, int j){
		System.out.println("ctt with 2 args.");
	}
}