package oops.inheritance;

public class Demo1 {

	public static void main(String[] args) {
		D d=new D();
		d.x=45;
		d.y=64;
		d.display();
		d.show();
	}

}
class C {
	int x;
	void display() {
		System.out.println("x= "+x);
	}
}
class D extends C{
	int y;
	void show() {
		System.out.println("x= "+x+"\t y= "+y);
	}
	
}