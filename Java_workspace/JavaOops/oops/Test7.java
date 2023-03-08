package oops;

public class Test7 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.initialise(10, 20);
		r.display();
	}

}
class Rectangle{
	int length;
	int breadth;
	void initialise(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void display() {
		System.out.println(length+" "+breadth);
	}
}