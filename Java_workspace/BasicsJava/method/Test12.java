package method;

public class Test12 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.initialise(10,20);
		Rectangle e=new Rectangle();
		e.initialise(30, 40);
		r.display();
		e.display();
	}
}
class Rectangle{
	int length;
	int width;
	void initialise(int l,int b){
		length=l;
		width=b;
	}
	void display() {
		System.out.println("["+length+" , "+width+"]");
	}
}