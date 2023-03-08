package oops.inheritance.ctt_chaining;

public class Cc1 {

	public static void main(String[] args) {
		new G();
	}
}
class F{
	F(int i){
		System.out.println("parameterised ctt in F");
	}
}
class G extends F{
	G(){
		super(10);
		System.out.println("Default ctt in G");
	}
}