package oops.object;

public class Prac4 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(45,64);
		r1.display();
		Rectangle r2=new Rectangle(r1);
		r2.display();
	}
}
class Rectangle{
	int length;
	int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	Rectangle(Rectangle arg){
		length=arg.length;
		breadth=arg.breadth;
	}
	void display() {
		System.out.println("length= "+length+", breadth= "+breadth);
	}
}