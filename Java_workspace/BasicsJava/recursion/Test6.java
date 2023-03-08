package recursion;

public class Test6 {

	public static void main(String[] args) {
		display(1);
	}
	static void display(int a) {
		if(a>10) return;
		System.out.println(a);
		display(a+1);
	}
}
// display 1 to 10 number without using loops