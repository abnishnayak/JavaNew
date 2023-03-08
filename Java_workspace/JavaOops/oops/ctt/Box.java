package oops.ctt;

public class Box {

	public static void main(String[] args) {
		Box1 b1=new Box1();
		b1.display();
		
		Box1 b2=new Box1(5,4,9);
		b2.display();
		
		Box1 b3=new Box1(8);
		b3.display();
	}

}
class Box1{
	int length;
	int width;
	int height;
	Box1(){}
	Box1(int l,int w,int h){
		length=l;
		width=w;
		height=h;
	}
	Box1(int n){
		length=n;
		width=n;
		height=n;
	}
	void display() {
		System.out.println("["+height+" , "+width+" , "+height+"]");
	}
}