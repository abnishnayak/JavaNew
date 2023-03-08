package oops.encapsulation;

public class Encap2 {

	public static void main(String[] args) {
		Area rectangle=new Area(84,95);
		rectangle.getArea();
	}
}
class Area{
	int length;
	int breadth;
	
	Area(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void getArea() {
		int area=length*breadth;
		System.out.println("Area of the Rectangle= "+area);
	}
}