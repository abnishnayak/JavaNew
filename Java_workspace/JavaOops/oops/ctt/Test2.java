package oops.ctt;

public class Test2 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,20);
		r1.display();
		Rectangle r2=new Rectangle(51,45);
		r2.display();
	}

}
class Rectangle{
	int length;
	int breadth;
	Rectangle(int l, int b){
		length=l;
		breadth=b;
	}
	void display() {
		System.out.println("length= "+length+", breadth= "+breadth);
	}
}