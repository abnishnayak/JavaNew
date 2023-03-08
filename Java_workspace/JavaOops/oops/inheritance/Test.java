package oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Snake s=new Snake();
		s.move();
	}

}
class Animals{
	void move() {
		System.out.println("running");
	}
}
class Snake extends Animals{
	//@Override //not mandatory
	void move() {
		System.out.println("Crawling");
	}
}