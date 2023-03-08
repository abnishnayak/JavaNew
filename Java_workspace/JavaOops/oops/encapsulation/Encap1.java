package oops.encapsulation;

public class Encap1 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(45);
		int r= c.getRadius();
		System.out.println(r);
	}
}
class Circle{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}