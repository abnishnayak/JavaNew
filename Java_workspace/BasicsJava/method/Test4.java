package method;

public class Test4 {
	public static void main() {
		System.out.println("main()");
	}
	public static void main(int a) {
		System.out.println("main(int)");
	}
	public static void main(String[] args) {
		System.out.println("main(string[] args)");
		main();
		main(10);
	}
}
