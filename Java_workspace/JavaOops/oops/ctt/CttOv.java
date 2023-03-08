package oops.ctt;

public class CttOv {
	public static void main(String[] args) {
		new F();
	}

}
class F{
	F(){
		new F(10);
	}
	F(int i){
		System.out.println("overloaded ctt executed.");
	}
}