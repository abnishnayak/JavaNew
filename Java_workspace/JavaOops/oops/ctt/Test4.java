package oops.ctt;

public class Test4 {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		
		c1.move();
		c2.move();
	}

}
class Car{
	int num;
	private static int n=6451;
	Car(){
		num=n;
		n++;
	}
	void move() {
		System.out.println(num+" Car is moving.");
	}
}