package oops.inheritance;

public class Demo3 {

	public static void main(String[] args) {
		Circle c=new Circle(98);
		c.displayArea();
		
		String s=c.toString();
		System.out.println(s);
		
		int n=c.hashCode();
		System.out.println(n);
	}
}
class Circle{
	int radius;
	Circle(int r){
		radius=r;
	}
	void displayArea() {
		System.out.println("Area= "+(3.14*radius*radius));
	}
}