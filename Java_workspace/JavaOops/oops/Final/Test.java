package oops.Final;

public class Test {

	public static void main(String[] args) {
		final Circle c=new Circle();
		System.out.println(c.radius);
		//c.radius=50;
		//System.out.println(c.radius);
	}
}
class Circle{
	final int radius=10;
}